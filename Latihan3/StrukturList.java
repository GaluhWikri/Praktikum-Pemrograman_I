package Latihan3;

public class StrukturList 
    private Node HEAD;

    // Konstruktor untuk inisialisasi HEAD
    public StrukturList() {
        this.HEAD = null;
    }
    
    // fungsi untuk pengecekan list apakah kosong atau tidak
    private boolean isEmpty () {
    	return HEAD == null;
    }
    
    // Fungsi untuk menambahkan node element
    public void addTail(int data) {
    	Node posNode = null, curNode = null;
    	Node newNode = new Node(data);
        if (isEmpty ()) {
            // Jika list kosong, data akan menjadi HEAD
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode != null) {
            	posNode = curNode;
                curNode = curNode.getNext();
            }
            // Menambahkan node baru di belakang node terakhir
            posNode.setNext(newNode);
        }
    }
               
    public void addHead(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) { 
            System.out.println("LIST KOSONG"); 
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void displayElement() {
    	if (isEmpty()) {
    		System.out.println("LIST KOSONG");
    		return;
    	}
    	Node curNode = HEAD ;
    	while (curNode != null) {
    		System.out.println(curNode.getData()+ "");
    		curNode = curNode.getNext();
    	}
    }
}
    

