import socket

# create an ipv4 (AF_INET) socket object using the TCP protocol (SOCK_STREAM)
client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# connect the client to the socket server
client.connect(('localhost', 1270))

# emit a message  to the socket server
message = 'This is a message from the client!'
client.send(message.encode())  # encode the message as a byte object

# receive the response data (4096 is recommended buffer size for the data)
response = client.recv(4096).decode()

print('From Server: {}'.format(response))
client.close()
