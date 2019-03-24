import socket
import threading

# create an ipv4 (AF_INET) socket object using the TCP protocol (SOCK_STREAM)
server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# (optional) allow the port to be bound again immediately instead of waiting for timeouts on the TCP stack
server.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)

# listen for emitted messages from the client socket
server.bind(('localhost', 1270))
server.listen(5)  # maximum number of client socket connections
print('Socket server has started listening on localhost:1270!')


def handle_client_connection(client_socket):
    request = client_socket.recv(1024).decode()  # 1024 bytes is recommended buffer size for the data
    print('From Client: {}'.format(request))
    message = 'We received your message, thank you!'
    client_socket.send(message.encode())  # encode a message back to the client
    client_socket.close()


while True:
    client_sock, address = server.accept()
    print('Accepted connection from {}:{}'.format(address[0], address[1]))
    client_handler = threading.Thread(
        target=handle_client_connection,
        args=(client_sock,)
    )
    client_handler.start()

server.close()
