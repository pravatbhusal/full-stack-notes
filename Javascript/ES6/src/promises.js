/* using "promises
a promise class takes an argument (the request) 
its callback contains two parameters (resolve and reject).
then you check if the promise succeeds or fails through
its handler (contains promiseClass.this() function)
promises are asynchronous, so they are like the modern 
version of EventListeners.
*/

//creating a new promise object, this runs even without a handler
let myPromise = new Promise((resolve, reject) => {
	//once a promise is fulfilled or rejected, it can no longer do it again
	//it will short-circuit after it sees a reject or resolve
	resolve("Good to go!");
	reject("The promise was rejected...");
});

//promise handler (contains two callbacks)
myPromise.then((resolved) => {
	console.log(resolved); //outputs the resolved value: Good to go!
}, (rejected) => {
	console.log(rejected); //outputs the rejected value: The promise was rejected...
});

//promise handler (contains two callbacks, but the second is catch)
//this does the same thing as above, but instead uses catch
myPromise.then((resolved) => {
	console.log(resolved); //outputs the resolved value: Good to go!
}).catch((rejected) => {
	console.log(rejected); //outputs the rejected value: The promise was rejected...
});

let myPromise2 = new Promise((resolve, reject) => {
	//resolves after 0.5 seconds
	setTimeout(() => {
		resolve("Promise 2 - the promising");
	}, 500);
}
//promises can handle multiple promises, and only initiates its code until it gets the values
Promise.all([myPromise,myPromise2]).then((resolved) => {
	console.log(resolved); //outputs 2 arrays from myPromise of myPromise2's resolve values
//if there is EVEN one rejected promise, then it will play the rejected
}).catch((rejected) => {
	console.log(rejected); //outputs 2 arrays from myPromise of myPromise2's reject values
});

//fetch is an asynchronous HTTP request that is a Promise
fetch("http://api.icndb.com/jokes/random/10").then((resolved) => {
	//the resolved.json() actually produces another promise, and we can extract the data from it
	resolved.json().then((data) => {
		console.log(data);
	});
}).catch((rejected) => {
	console.log(rejected);
});
	