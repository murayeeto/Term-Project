import socket
import re
import os

try:
    import netifaces
except ImportError as ie:
    print(ie)
    print("run:  pip3 install netifaces");
    exit(1)


def get_ip():
    interfaces = netifaces.interfaces()
    ipv4 = []
    for iface in interfaces:
        addresses = netifaces.ifaddresses(iface)
        if netifaces.AF_INET in addresses and addresses[netifaces.AF_INET][0]['addr'] != '127.0.0.1':
            ipv4.append(addresses[netifaces.AF_INET][0]['addr'])

    if len(ipv4) > 1:
        return ipv4[0]   # TODO - this needs to be changed in the future
    elif len(ipv4) == 1:
        return ipv4[0]
    return ''


def get_broadcast_addr(ip):
    interfaces = netifaces.interfaces()
    bcast = ''
    for iface in interfaces:
        addresses = netifaces.ifaddresses(iface)
        if netifaces.AF_INET in addresses and addresses[netifaces.AF_INET][0]['addr'] == ip:
            bcast = addresses[netifaces.AF_INET][0]['broadcast']

    return bcast


def is_socket_closed(sock: socket.socket) -> bool:
    try:
        data = sock.recv(16, socket.MSG_DONTWAIT | socket.MSG_PEEK)
        if len(data) == 0:
            return True
    except BlockingIOError as bioe:
        # print(bioe)
        return False
    except ConnectionResetError as cre:
        # print(cre)
        return True
    except BrokenPipeError as bpe:
        # print(bpe)
        return True
    except Exception as e:
        # print(e)
        return False
    return False


def start_tcp_server(ip, port):
    tcp_server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
    tcp_server_socket.bind((ip, port))
    tcp_server_socket.listen(1)
    tcp_server_socket.setblocking(False);
    print(f"The TCP server is ready on ({ip}, {port}).")
    return tcp_server_socket


def start_udp_server(ip, port):
    udp_server_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    udp_server_socket.bind((ip, port))
    # udp_server_socket.setblocking(False);
    print(f"The UDP server is ready on ({ip}, {port}).")
    return udp_server_socket


def accept_tcp_connection(tcp_server):
    tcp_connection_socket, addr = tcp_server.accept()
    tcp_connection_socket.setblocking(True)
    print(f"Accepted connection from {addr}!")
    return tcp_connection_socket, addr


def respond_to(host_id, with_address, port=13000):
    broadcast_server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    broadcast_server.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)
    broadcast_server.bind(('0.0.0.0', port))
    (message, address) = broadcast_server.recvfrom(1024)
    if message.decode() == host_id:
        response = pickle.dumps(with_address)
        broadcast_server.sendto(response, address)
    broadcast_server.close()


def send_discover_message(server, message):
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    client_socket.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
    client_socket.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)
    client_socket.settimeout(3)
    response = b''
    tries = 3
    while len(response) < 1 and tries > 0:
        try:
            client_socket.sendto(message.encode(), server)
            response, server_address = client_socket.recvfrom(1048)
        except socket.timeout as t:
            print("no response!")
            pass
        tries -= 1

    return response.decode()


def send_udp_message(server, message):
    client_socket = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
    client_socket.sendto(message.encode(), server)
    client_socket.settimeout(3)
    try:
        response, server_address = client_socket.recvfrom(1048)
    except socket.timeout as t:
        response = b''
    return response.decode()
