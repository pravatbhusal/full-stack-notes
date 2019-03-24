package graphs;

public class App {

	// test the Graph data structure
	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.addEdge(0, 5);
		graph.addEdge(1, 7);
		graph.addEdge(3, 12);
		
		// output the adjacents to vertex three
		Object[] vertexThree = graph.showAdjacents(3);
		for(int adjacent = 0; adjacent < vertexThree.length; adjacent++) {
			System.out.println(vertexThree[adjacent]);
		}
	}
}
