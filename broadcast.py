#!python3
import socket
import comm
import pickle
import time

if __name__ == "__main__":
    time.sleep(20)
    hostname = socket.gethostname()
    broadcast_port = 13000
    ip = comm.get_ip()

    server_port = 12000

    if len(ip) == 0:
        print('No interface found that has an IP address')
        exit(1)

    try:
        # start broadcast server and wait for query
        broadcast_server = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
        broadcast_server.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)
        broadcast_server.bind(('0.0.0.0', broadcast_port))
        print(f'Listening on port {broadcast_port} for broadcast {hostname} broadcast requests.')
    except Exception as e:
        print(e)
        exit(2)

    while True:
        try:
            (message, address) = broadcast_server.recvfrom(1024)
            if message.decode() == hostname:
                # response = pickle.dumps((ip, server_port))
                response = ip+":"+str(server_port)
                response = response.encode()
                broadcast_server.sendto(response, address)
        except Exception as e:
            print(e)
            break
    broadcast_server.close()



