package graphs;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/*** Breadth First Search */
public class BFS {

	public void search(Vertex root) {

		/* FIFO Structure Queue */
		Queue<Vertex> queue = new LinkedList<>(Collections.singletonList(root));

		/* Loop Until Queue is empty */
		while (!queue.isEmpty()) {

			/* Get the actual Vertex */
			Vertex actualVertex = queue.remove();
			System.out.println(actualVertex);

			/* Check if neighbour is visited */
			actualVertex.getNeighbourList().forEach(neighbour -> {
				if (!neighbour.isVisited()) {
					neighbour.setVisited(true);
					queue.add(neighbour);
				}
			});

		}
	}
}
