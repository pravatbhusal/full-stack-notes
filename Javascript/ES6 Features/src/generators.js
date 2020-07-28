/**
 * Generators are similar to iterators, in which you call next()
 * for each yield in a generator. The yield will return a value
 * to the next() call.
 */

function* generatorFunc() {
    console.log("Hello");
    yield 1;
    console.log("World");
    yield 2;
    console.log("!");
    yield 3;
}

const generatorObj = generatorFunc();

const firstVal = generatorObj.next();
console.log(firstVal.value); // 1

const secondVal = generatorObj.next();
console.log(secondVal.value); // 2

const thirdVal = generatorObj.next();
console.log(thirdVal.value); // 3

const fourthVal = generatorObj.next();
console.log(fourthVal.value); // undefined

/**
 * Output:
 *
 * Hello
 * 1
 * World
 * 2
 * !
 * 3
 * undefined
 */

/**
 * How it works:
 * 1. The first next() will return the first yield's value and then stop the generator.
 * 2. The second next() will return the second yield's value and then stop the generator.
 * 3. The third next() will return the third yield's value and then stop the generator.
 * 4. The fourth next() will return the fourth's yield value and then stop the generator,
 *    but in the fourth case there is no fourth yield value so it returns undefined.
 */