# Table Data Structure
A data structure that maps keys (indexes) to values (Objects).

# Hash Table
A powerful data structure that has a O(1) retrieval algorithm. It utilizes the concept of Array index positions in order to achieve the O(1) complexity. The hash function uses a hash function to map Objects to index positions, so we can retrieve an Object's index position instantly.

<img src="images/hashtable.png" width="600" height="375" />

### Hashing
Hashing maps Objects to an index position within an Array, which allows for the O(1) retrieval algorithm.

### Linear Probing (Slow Probing, disregard)
Linear probing, or linear open addressing, is a "collision resolver" for hashing functions.  

Whenever hashing, if the hash functions maps an Object to an index that is already filled, then it goes to the next index, and the next index, and the next index, until the probing algorithm finds an available index.

### Quadratic Probing (Normal Probing, disregard)
Quadratic probing, or quadratic open addressing, is a "collision resolver" for hashing functions.  

Whenever hashing, if the function maps an Object to an index that is already filled, then it goes to the `i^2 + 1` index, then the `i^2 + 2` index, until the probing algorithm finds an available index.

### Double Hashing Probing (Fastest Probing, Hash Table's hashing algorithm)
Double Hashing probing is a "collision resolver" for hashing functions.  

Whenever hashing, if the function tries to map an Object to an index that is already filled, then it  utilizes a second hashing algorithm that determines an open index using a stepSize. For example, let's say the index is 5, the stepSize is 3, and the arraySize is 29. Therefore, the open index for the Object should be `(5 + 3) % 29 = 8`. If the index is not open there, then we repeat the probing calculation using `(8 + 3) % 29 = 11` and check if there's an open index. If there's still not an open index, then the program keeps calculating until it finds an open index.  

We can derive these operations to create a formula:  
- `openIndex = (index + stepSize) % arraySize`

Some important things to consider:
- The first hashing algorithm must be different from the second hashing algorithm
- The second hashing algorithm cannot set stepSize equal to 0, or else this would create an infinite loop

### The Array Size MUST Be a Prime Number
Array size MUST be a prime number or else there would occur an infinite loop. For example, let's say index is 0, the stepSize is 5, and the arraySize is 15 (a non-prime number). The calculation would incur an infinite loop:  
1. (0 + 5) % 15 = 5  
2. (5 + 5) % 15 = 10  
3. (10 + 5) % 15 = 0  
4. (0 + 5) % 15 = 5 etc.. (infinite loop)  

Instead, if the arraySize was 13.  
1. (0 + 5) % 13 = 5  
2. (5 + 5) % 13 = 10  
3. (10 + 5) % 13 = 2 etc.. (this does not incur an infinite loop)
