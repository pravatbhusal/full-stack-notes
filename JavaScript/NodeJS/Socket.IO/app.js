//express and socket.io modules
var express = require('express');
var socket = require('socket.io');

//web-server setup
var app = express();
var server = app.listen(3000, () => {
  console.log("Server started on port 3000...");
})

//serve the static client files from the "client" folder
app.use(express.static("client"));

//socket.io setup
var io = socket(server);
io.on('connection', (socket) => {
  console.log("A client just connected with a socket id of: " + socket.id);

  //emit to only the sender client
  socket.emit("welcome", "Welcome to the application!");

  //get the chat emit from a client
  socket.on('chat', (data) => {
    //send a chat emit to all the clients
    io.sockets.emit('chat', data)
  });

  //emit a broadcast (emits to all clients except the sender)
  socket.on('broadcast', (data) => {
    socket.broadcast.emit('broadcast', data);
  });
});
