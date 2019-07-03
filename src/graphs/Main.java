package graphs;

public class Main {

	public static void main(String[] args) {

		Vertex vertex1 = new Vertex(1);
		Vertex vertex2 = new Vertex(2);
		Vertex vertex3 = new Vertex(3);
		Vertex vertex4 = new Vertex(4);
		Vertex vertex5 = new Vertex(5);

		vertex1.addNeighbourList(vertex2, vertex4);
		vertex2.addNeighbourList(vertex3);
		vertex4.addNeighbourList(vertex5);


		/* Breadth First Search */
		BFS bfs = new BFS();
		bfs.search(vertex1);

		/* Depth First Search */

	}
}
