// BAD WAY
const doStuff = (someArray, lookFor) => {
  const someTracker = [];
  someArray.forEach(thing => {
    if (thing) {
      thing.things.forEach(thingsThing => {
        if (thingsThing.look === lookFor) {
          someTracker.push(thingsThing);
        }
      })
    }
  })
  return someTracker;
}

// Better Way
const otherStuff = (someTracker, lookFor) => thingsThing => {
  if (thingsThing === lookFor) {
    someTracker.push(thingsThing);
  }
}
const doStuff = (someArray, lookFor) => {
  const someTracker = [];
  someArray.forEach(thing => {
    if (!thing) return;
    thing.things.forEach(otherStuff(someTracker, lookFor))
  });
  return someTracker;
}

/**
This is better since now the code inside of the 2nd for-each doesn't have to be re-created each time since it's now referenced in the otherStuff function. This
in fact also means it increases the performance of our JavaScript code.

Also, the code is much easier to read and handles solving the issue of callback hell.
*/
