package treeandgraph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {
	private Node graphs[];
	private int size;
	private int currentIndex;
	
	public Graph(int size) {
		this.currentIndex = 0;
		this.size = size;
		graphs = new Node[size];
	}
	
	public void addNode(Node newNode) {
		this.graphs[this.currentIndex] = newNode;
		this.currentIndex++;
	}
	
	public void addAdjcent(int mainIndex , int sub) {
		graphs[mainIndex].addNeighbor(sub);
	}
	
	public boolean isVisitedThisIndex(int index) {
		return graphs[index].isVisited();
	}
	
	public void BFS(int rootIndex) {
		Queue<Node> queue = new LinkedList();
		
		queue.add(graphs[rootIndex]);
		graphs[rootIndex].visit();
		
		while(! queue.isEmpty()) {
			Node r = queue.poll();
			for(int adjcent : r.getAdj()) {
				if (!graphs[adjcent].isVisited()) {
					graphs[adjcent].visit();
					queue.add(graphs[adjcent]);
				}
			}
		}
	}
}
