package Latihan11;

public class Vertex {

    private char label; // label (e.g. 'A')
    private boolean wasVisited;

    public Vertex(char lab) { // constructor
        setLabel(lab);
        setWasVisited(false);
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

