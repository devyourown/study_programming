package treeandgraph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PathBetweenNodes {

	public static void main(String[] args) throws IOException {
		Graph graph = new Graph(7);
		for(int i=0; i<7; i++) {
			graph.addNode(new Node(i));
		}
		
		graph.addAdjcent(0, 1);
		graph.addAdjcent(1, 2);
		graph.addAdjcent(2, 0);
		graph.addAdjcent(2, 3);
		graph.addAdjcent(3, 2);
		graph.addAdjcent(4, 6);
		graph.addAdjcent(5, 4);
		graph.addAdjcent(6, 5);
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int firstNode = Integer.parseInt( bf.readLine());
		int secondNode = Integer.parseInt(bf.readLine());
		graph.BFS(firstNode);
		if(graph.isVisitedThisIndex(secondNode)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
