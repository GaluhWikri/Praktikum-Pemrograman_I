package Latihan11;

public class Graph {
    private Vertex vertexList[]; // list of vertices
    private int adjMat[][]; // current adjacency matrix
    private int nVerts; // current number of vertices

    public Graph(int maxVerts) { // constructor
        vertexList = new Vertex[maxVerts]; // list of vertices
        adjMat = new int[maxVerts][maxVerts]; // adjacency matrix
        nVerts = 0;
        
        for(int i=0; i<maxVerts; i++)  // set adjacency 
            for(int j=0; j <maxVerts; j++)  // matrix to 0 
                adjMat[i][j] = 0;
            }
         
    // end constructor
    public void addVertex(char lab) { // argument is label-
        vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }

    public void adjacencyMatrix() {
        for (int i = 0; i < adjMat.length; i++) {
            for (int j = 0; j < adjMat[i].length; j++) {
                System.out.print(adjMat[i][j] + " ");
            }
            System.out.println();
        }
    }
    

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
