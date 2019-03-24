//events module
var events = require('events');

//event emitter object
var eventEmitter = new events.EventEmitter();

//create an event handler
var eventHandler = function() {
  console.log("I hear a scream!");
}

//assign the event handler to an event
eventEmitter.on("scream", eventHandler);

//fire the event, "scream"
eventEmitter.emit("scream");
