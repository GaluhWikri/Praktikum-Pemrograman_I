package Latihan11;

public class Vertex {

    private char label; // Label dari vertex, contohnya 'A'
    private boolean wasVisited; // Menunjukkan apakah vertex telah dikunjungi atau belum

    public Vertex(char lab) { // constructor
        setLabel(lab);  // Mengatur label dari vertex
        setWasVisited(false); // Menginisialisasi menjadi false
    }
    
    
    /** Setter dan Getter **/
	public char getLabel() {
		return label;
	}

	public void setLabel(char label) {
		this.label = label;
	}

	public boolean isWasVisited() {
		return wasVisited;
	}

	public void setWasVisited(boolean wasVisited) { 
		this.wasVisited = wasVisited;
	}
}

