package Latihan4;

public class Node {
	   	private double data;
	    private Node next;

	    // Konstruktor untuk menginisialisasi node dengan data
	    public Node(double data) {
	        this.data = data;
	        this.next = null;
	    }

	    // setter & getter
	    
	    public void setData(int data) {
	        this.data = data;
	    }

	    public double getData() {
	        return data;
	    }

	    public void setNext(Node next) {
	        this.next = next;
	    }
	    
	    public Node getNext() {
	    	return next;
	    }
	}
