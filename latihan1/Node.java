package latihan1;

public class Node {
	private int nilai;
	private Node next;
	
	//inisiasi node 
	public Node(int nilai) {
		this.nilai = nilai;
	}
	//setter dan getter 
	public void setNilai(int nilai) {
		this.nilai = nilai;
	}
	public int getNilai() {
		return nilai;
	}
	//getter atribut next
	public Node getNext() {
		return next;	
	}
	//setter atribut next 
	public void setNext(Node next) {
		this.next = next ;
	}
}
