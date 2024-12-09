package AtividadeBusca;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public class DFS {

	public void dfs(Graph graph) {
		Set<Node> nodes = graph.getMap().keySet();
		
		Iterator it = nodes.iterator();
		
		while(it.hasNext()){
			Node node = (Node) it.next();
			if(node.getColor() == false) {
				node.setColor(true);
				System.out.println(node.getColor());
			}
			
		}
		
	}
	
	public void dfsVisit(Graph graph, Node node) {
		LinkedList<Node> adjList = graph.getMap().get(node);
		Iterator it = adjList.iterator();
		while (it.hasNext()) {
			Node nodeadj = (Node) it.next();
			if (!nodeadj.getColor()) {
				nodeadj.setColor(true);
				dfsVisit(graph, nodeadj);
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		Node na = new Node("A");
		Node nb = new Node("B");
		Node nc = new Node("C");
		
		Graph graph = new Graph();
		
		graph.addEdge(na, nb);
		graph.addEdge(na, nc);
		graph.printGraph();
		
		System.out.println("-----------------");
		
		DFS dfsobjective = new DFS();
		dfsobjective.dfs(graph);
		
	}
}
