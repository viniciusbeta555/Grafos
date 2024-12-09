package AtividadeBusca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

//import listadeadjacencia.Node;

public class Graph {
	
	private LinkedList<Node> adjlist;
	private HashMap<Node,LinkedList<Node>> map= 
			new HashMap<Node,LinkedList<Node>>();
	
	public void addEdge(Node v1, Node v2) {
		
		if (this.map.containsKey(v1)) {
			this.map.get(v1).add(v2);
		}else {
			this.adjlist = new LinkedList<Node>();
			this.adjlist.add(v2);
			this.map.put(v1, adjlist);
		}
		
		if (this.map.containsKey(v2)) {
			this.map.get(v2).add(v1);
		}else {
			this.adjlist = new LinkedList<Node>();
			this.adjlist.add(v1);
			this.map.put(v2, adjlist);
		}
		
	}
	
	

	public LinkedList<Node> getAdjlist() {
		return adjlist;
	}

	public HashMap<Node, LinkedList<Node>> getMap() {
		return map;
	}
	
	public void printGraph() {
		Iterator<Node> node_iterator = map.keySet().iterator();
		while(node_iterator.hasNext()) {
			Node node = node_iterator.next();
			System.out.println(node.getValue() + ":" + 
			Arrays.toString(toArrayValues(map.get(node))));
		}
	}
	
	private String[] toArrayValues(LinkedList<Node> linkedList) {
		String[] values = new String[linkedList.size()];
		for (int i = 0; i < linkedList.size();i++) {
			values[i] = linkedList.get(i).getValue();
		}
		return (values);
	}

}