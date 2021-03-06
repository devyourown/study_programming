package treeandgraph;

import java.util.LinkedList;

public class Node {
	private LinkedList<Integer> adjcent;
	private int index;
	private boolean isVisited;
	
	public Node(int index) {
		this.index = index;
		adjcent = new LinkedList<>();
		isVisited = false;
	}
	
	public void addNeighbor(int otherIndex) {
		adjcent.add(otherIndex);
	}
	
	public LinkedList<Integer> getAdj() {
		return this.adjcent;
	}
	
	public void visit() {
		this.isVisited = true;
	}
	
	public boolean isVisited() {
		return this.isVisited;
	}
}
