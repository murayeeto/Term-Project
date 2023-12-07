#!python3
import comm
import re
import time


class Server:
    def __init__(self, ip = None, port = None):
        if ip is None:
            self.ip = comm.get_ip()
            if len(self.ip) == 0:
                raise Exception("No Interface Found!")
        else:
            self.ip = ip

        if port is None:
            self.port = 12000
        else:
            self.port = port

        self.udp_server = comm.start_udp_server(self.ip, self.port)
        self.client_address = tuple()
        self.pat = re.compile(r'(.*)(?= OK!$)')

    def receive(self, buffer_size=1024):
        (msg, self.client_address) = self.udp_server.recvfrom(buffer_size)
        msg = msg.decode()
        response = msg + " OK!"
        self.udp_server.sendto(response.encode(), self.client_address)

        return msg

    def send(self, message):
        self.udp_server.sendto(message.encode(), self.client_address)
        is_done = False
        while not is_done:
            (response, self.client_address) = self.udp_server.recvfrom(len(message) + 20)
            if re.search(self.pat, response.decode()):
                is_done = True

    def close(self):
        self.udp_server.close()


if __name__ == "__main__":
    time.sleep(20)  # wait for systemd to complete before starting up server
    udp_server = Server()
    try:
        is_done = False
        while not is_done:
            message = udp_server.receive()
            print(f'MESSAGE: {message}')
            if message == 'goodbye':
                is_done = True
    except Exception as e:
        print(e)
        udp_server.close()



  
