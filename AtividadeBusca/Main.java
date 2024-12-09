package AtividadeBusca;

public class Main {

	public static void main(String[] args) {
		Graph grafo = new Graph();
		Node a = new Node("A");
		Node b = new Node("B");
		Node c = new Node("C");
		grafo.addEdge(a, b);
		grafo.addEdge(a, c);
		//grafo.addEdge(c, b);
		grafo.printGraph();
		System.out.println(grafo.getMap().size());
	}

}
