# Graphs
Graphs are either directed or undirected. Graphs have vertices (Nodes) like LinkedLists, and they have edges or paths (Branches) like Trees. Each edge of a graph has a number that represents the distance between the connected vertices. A degree is the number of connected edges to a vertex, and there are outgoing degrees (primary vertex to connected vertex) and incoming degrees (connected vertex to primary vertex).

<img src="/references/Java/DS and Algos/src/graphs/images/graphs.jpg" width="600" height="325" />

### Graph Theory
Graph theory is the study of graphs. Typically, it involves finding the shortest distance between vertices, also called Dijkstra's Algorithm.

### Directed Graph
A directed graph's vertices only travel in the directions specified.It uses arrows to point to the direction specified.

### Undirected Graph
An undirected graph's vertices only travel in-between connected vertices.

### Graph Adjacency
Adjacency refers to the vertices that are next to each other.

###### Graph Adjacency List
An adjacency list is a collection of unordered lists used to represent a finite graph. Per cell, the first element is the connected vertex, the second element is the edge's value (distance from primary vertex to connected vertex), and the third element is another cell connected to the primary vertex.

<img src="/references/Java/DS and Algos/src/graphs/images/adjacency.png" width="1100" height="400" />

### Graph Notation
The following notation is a representation of the directional graph image below.  
If a graph is directional, then the edges notation MUST be in directional order.  
- (V)ertices = {A, B, C, D, E, F}
- (E)dges = {(A, B), (B, C), (C, E), (E, F), (E, D), (D, B)}
- (G)raph = (V,E)

<img src="/references/Java/DS and Algos/src/graphs/images/graphnotation.png" width="350" height="200" />
