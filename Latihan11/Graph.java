package Latihan11;

public class Graph {
    private Vertex vertexList[]; // List dari vertices
    private int adjMat[][]; // Matriks keberadjasian saat ini
    private int nVerts; // Jumlah vertices saat ini

    public Graph(int maxVerts) { // constructor
        vertexList = new Vertex[maxVerts]; // Inisialisasi list dari vertices
        adjMat = new int[maxVerts][maxVerts]; // Inisialisasi adjacency matrix
        nVerts = 0; // Mulai dengan 0 vertices 
        
        for(int i=0; i<maxVerts; i++)  // set adjacency 
            for(int j=0; j <maxVerts; j++)  // matrix to 0 
                adjMat[i][j] = 0;
            }
         
    // Method untuk menambahkan sebuah vertex dengan label tertentu
    public void addVertex(char lab) { 
        vertexList[nVerts++] = new Vertex(lab); // Tambahkan vertex ke vertex list
    }

    // Method untuk menambahkan sebuah edge antara dua vertices
    public void addEdge(int start, int end) {
        adjMat[start][end] = 1; // Atur adjacency matrix untuk menunjukkan adanya edge
        adjMat[end][start] = 1; // Karena graf tidak berarah, jadi setuju antara start dan end 
    }
    
    // Method untuk menampilkan adjacency matrix
    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j] + " "); // Print elemen adjacency matrix
            }
            System.out.println();
        }
    }
    
    //setter & getter    

	public Vertex[] getVertexList() {
		return vertexList;
	}

	public void setVertexList(Vertex vertexList[]) {
		this.vertexList = vertexList;
	}

	public int getnVerts() {
		return nVerts;
	}

	public void setnVerts(int nVerts) {
		this.nVerts = nVerts;
	}
}
