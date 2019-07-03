package graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vertex {

	private int data;
	private boolean visited;
	private List<Vertex> neighbourList;

	public Vertex(final int data) {
		this.data = data;
		this.neighbourList = new ArrayList<>();
	}

	public int getData() {
		return data;
	}

	public void setData(final int data) {
		this.data = data;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(final boolean visited) {
		this.visited = visited;
	}

	public List<Vertex> getNeighbourList() {
		return neighbourList;
	}

	public void setNeighbourList(final List<Vertex> neighbourList) {
		this.neighbourList = neighbourList;
	}

	public void addNeighbourList(Vertex... vertex) {
		this.neighbourList.addAll(Arrays.asList(vertex));
	}

	@Override
	public String toString() {
		return "Vertex{" +
			"data=" + data +
			'}';
	}
}
