package Latihan11;

public class GraphMain {
    public static void main(String[] args) {
    	// latihan 5
       // Membuatkan vertex
//        Graph graph = new Graph(5); // (5) for dfs
//        graph.addVertex('A'); // 0
//        graph.addVertex('B'); // 1
//        graph.addVertex('C'); // 2
//        graph.addVertex('D'); // 3
//        graph.addVertex('E'); // 4
//
//       // Membuatkan edge
//        graph.addEdge(0, 1); // AB
//        graph.addEdge(1, 2); // BC
//        graph.addEdge(0, 3); // AD
//        graph.addEdge(3, 4); // DE
//        graph.adjacencyMatrix();
//        System.out.println();
//    }
//}
//    }
    
    	//latihan Tugas 
    // Membuatkan vertex
    Graph graph = new Graph(4); // (5) for dfs
    graph.addVertex('A'); // 0
    graph.addVertex('B'); // 1 
    graph.addVertex('C'); // 2
    graph.addVertex('D'); // 3

    // Membuatkan edge
    graph.addEdge(0, 1); // AB
    graph.addEdge(1, 3); // BD
    graph.addEdge(0, 3); // AD
    graph.addEdge(0, 2); // AC
    
    graph.adjacencyMatrix();
    System.out.println();
    }
}
