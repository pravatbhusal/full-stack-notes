package graphs;

import java.util.ArrayList;

public class Graph {

	// number of vertices (Nodes)
	private int vertices;

	// number of edges (Branches)
	private int edges;

	// Array of ArrayLists container to represent the Graph
	private ArrayList<Integer>[] adjacents;

	// Graph constructor
	public Graph(int vertices) {
		this.vertices = vertices;
		edges = 0;
		adjacents = new ArrayList[vertices];

		// initialize each index of the adjacents Array
		for(int index = 0; index < vertices; index++) {
			adjacents[index] = new ArrayList<Integer>();
		}
	}

	// return the number of vertices
	public int getVertices() {
		return vertices;
	}

	// return the number of edges
	public int getEdges() {
		return edges;
	}

	// add an edge (value or distance) to a vertex
	public void addEdge(int vertex, int edge) {
		if(vertex <= vertices && vertex >= 0) {
			adjacents[vertex].add(edge);
			edges++;
		} else {
			throw new RuntimeException("Cannot add an Edge into an invalid vertex");
		}
	}

	// return the adjacent vertices to a vertex
	public Object[] showAdjacents(int vertex) {
		if(vertex <= vertices && vertex >= 0) {
			return adjacents[vertex].toArray();
		} else {
			throw new RuntimeException("Cannot show adjacents for an invalid vertex.");
		}
	}
}