package Latihan3;

public class Node {
    private int data;
    private Node next;

    // Konstruktor untuk menginisialisasi node dengan data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // setter & getter
    
    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
    public Node getNext() {
    	return next;
    }
}


	
