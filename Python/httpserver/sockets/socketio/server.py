from flask import Flask, request
from flask_socketio import SocketIO, emit

# initiate the flask and socketio application
app = Flask(__name__)
app.config['SECRET_KEY'] = 's0Qi0mweln'  # a random key used to encrypt your cookies and safely send them to the browser
socketio = SocketIO(app)


# handle the client's connection
@socketio.on('connect')
def connect():
    user = request.sid
    print(user + " joined!")
    emit('connected', 'Connected to the socket server! Your session id is ' + user + '.')
    emit('broadcast', user + ' joined!', broadcast=True, include_self=False)


# handle the client's disconnection, the heartbeat (time) for the server to handle disconnection takes a minute
@socketio.on('disconnect')
def disconnect():
    user = request.sid
    print(user + " left!")
    emit('broadcast', user + ' left!', broadcast=True)


# listen to a broadcast from a client
@socketio.on('broadcast')
def broadcast(message):
    emit('broadcast', message, broadcast=True, include_self=False)


# if running as the main program, initiate the flask-socketio on localhost:5000
if __name__ == "__main__":
    app.debug = True  # NOTE: disable debug mode when deploying to production
    socketio.run(app, 'localhost', '5000')
