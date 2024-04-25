package Latihan8;

public class StrukturQueue {
	
	private Node FRONT; // Node depan antrian
    private Node REAR; // Node belakang antrian
    
// Konstruktor untuk inisialisasi FRONT dan REAR
    public StrukturQueue() {
        this.FRONT = null; 
        this.REAR = null;
    }
    
 // Fungsi untuk memeriksa apakah antrian kosong
	public boolean isEmpty() {
		return FRONT == null;
	    }	

// Fungsi untuk menambahkan elemen ke dalam antrian
	public void enqueue (int data) {
		Node newNode = new Node(data);
		
		if (isEmpty()) {
			FRONT = newNode;
			REAR = newNode;
		}
		else {
			REAR.setNext(newNode);
			REAR = newNode;
		}
	}	

// Fungsi untuk menghapus elemen dari depan antrian
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Data masih kosong");
		}else {
			FRONT = FRONT.getNext();
			if (FRONT == null);{
			REAR = null; 
		}
	}
}		
	
	
// Fungsi untuk mengembalikan jumlah elemen dalam antrian
	public int size() {
		int size = 0 ;
		Node curNode = FRONT;
		while(curNode != null) {
			size++;
			curNode = curNode.getNext();
		}
		return size;
	}
	
// Fungsi untuk mengembalikan data dari elemen depan antrian
	public int front() {
		return FRONT !=null ? FRONT.getdata() : -1;
	}       
	
// Fungsi untuk menampilkan seluruh elemen dalam antrian
	public void displayElement() {
		Node curNode = FRONT;
		if (isEmpty()) {
			System.out.println("Elemen Queue: queue kosong");
		} else {
            System.out.print("Elemen Queue: ");
            while (curNode != null) {
                System.out.print(curNode.getdata() + " ");
                curNode = curNode.getNext();
            }
            System.out.println(); // Tambahkan baris baru setelah selesai menampilkan elemen
        }
	}
}
