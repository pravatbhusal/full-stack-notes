# Tree Data Structure
The first Node on the top of a tree is the "root" Node, and each Node connected below it
are considered "children" Nodes. And those "children" Nodes may have children too which are called "grand children," and so and so forth. At the very end once there are no more children Nodes, these Nodes are called "leaf" Nodes. Each branch from a parent Node to a child Node is called an "edge" or "path." For each generation of Nodes, programmers call it "level" or "depth."  

### Balanced Tree
A balanced tree is when the left and right Nodes' heights differ at most by a level of 1. So if the right Node has a child and a grand-child, but the left Node has no children then the heights differ by a level of 2. Therefore, it is not a balanced tree. When a tree is balanced, the worst-case complexity for the insertion/searching algorithm is O(log(n)), but when it's not balanced it becomes O(n).  

# Binary Search Tree
Offers the searching benefit of an ordered Array and the structure of a LinkedList.  

A binary tree, or binary search tree, contains Nodes with no more than two children. The left child Node must be less than the parent Node, and the right child Node must be greater than or equal to the parent Node. This makes traversing (navigating) a binary search tree easier to search for a Node.  

<img src="/references/Java/DS and Algos/src/trees/images/binarysearchtree.gif" width="350" height="250" />

# Heap (Binary)
Heaps, or binary heap, contain Nodes with no more than two children. They're structured by inserting into the left-most child of the level to the right-most child of the level. Therefore, if there's a missing left-side Node but there's a right-side Node, then the tree is not a Heap.  

Unlike Binary Search Trees that utilize Nodes like a Linked List, Heaps use Arrays because Arrays take less memory than Nodes and since Heaps insert Nodes from left to right we can use simple arithmetic to determine a Node's location.  
- Index of left child of a Node with index i: `2i + 1`
- Index of right child of a Node with index i: `2i + 2`
- Index of parent of a Node with index i: `(i - 1) / 2`

There are two types of Heaps: maximum and minimum.  

### Max Heap
The root Node is the largest Node, and all parents are greater than or equal to the child Node. When inserting a Node that is larger than its parent, we must "trickle-up" the tree and replace Nodes till we find the proper location. When deleting a Node, we swap locations with the deleted Node and the newest Node, delete the newest Node's old reference, and "trickle-down" the tree and replace Nodes till we find the proper location.   

<img src="/references/Java/DS and Algos/src/trees/images/max_heap.jpg" width="500" height="250" />

### Min Heap
The root Node is the smallest Node, and all parents are less than or equal to the child Node. When inserting a Node that is smaller than its parent, we must "trickle-down" the tree and replace Nodes till we find the proper location. When deleting a Node, we swap locations with the deleted Node and the root Node, delete the newest Node's old reference, and "trickle-up" the tree and replace Nodes till we find the proper location.  

<img src="/references/Java/DS and Algos/src/trees/images/min_heap.jpg" width="500" height="250" />

# Red-Black Tree (Binary)
Due to the complex nature of Red-Black Trees, there is no `RedBlackTree.java` file in this repository that implements the data structure.  

Red Black Trees are a Binary Search Tree with more algorithms to ensure it stays balanced:  
1. Each Node is either Red or Black  
2. The root Node is Black  
3. If a Node is Red, its children must be Black  
4. The tree's paths must follow "Path Rule"
    - All paths from a Node to a null link must contain the same number of Black Nodes  
5. Paths from the root Node to elements with zero or one children are special  

<img src="/references/Java/DS and Algos/src/trees/images/redblacktree.jpg" width="350" height="250" />

### Properties
1. If a Red Black Tree is complete (all Black Nodes except Red leaves at the lowest level), the height for n elements will be minimal: ~log(n)
2. To get the maximum height for n elements, there should be as many Red Nodes as possible down one path and all other Nodes are Black: ~2log(n)

<img src="/references/Java/DS and Algos/src/trees/images/maxheight_rbt.jpg" width="400" height="275" />

### Inserting/Deleting
Whenever inserting or deleting into the RBT, you must rotate the tree between parent and grandparent then make appropriate color changes.

<img src="/references/Java/DS and Algos/src/trees/images/insert_redblacktree.jpg" width="450" height="350" />
