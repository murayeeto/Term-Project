import comm
import sys

if __name__ == '__main__':
    if len(sys.argv) < 2:
        print(f'SYNOPSIS: {sys.argv[0]} <hostname of machine>')
        exit(1)

    ip = comm.get_ip()
    # port = 12000
    broadcast_addr = comm.get_broadcast_addr(ip)
    message = sys.argv[1]
    # print(f"Sending message to broadcast address {broadcast_addr} ...")
    server_addr = comm.send_discover_message((broadcast_addr, 13000), message)
    if len(server_addr) < 1:
        print("No Response. Make sure server is running on the network.")
    else:
        (ip, port) = server_addr.split(sep=':')
        print(f'BROADCAST RESPONSE: {ip}')
