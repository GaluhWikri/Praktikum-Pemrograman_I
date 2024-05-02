package Latihan9;

public class StrukturStack {
    private int [] array; 
    private int capacity; 
    private int TOP;
    public final int MIN = -1;
    
    // Konstruktor untuk membuat objek StrukturStack dengan kapasitas tertentu
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity ;
        TOP = MIN; 
    }

    // Method untuk memeriksa apakah stack penuh
    public boolean IsFull() {
        return (TOP == capacity -1); 
    }
    
    // Method untuk memeriksa apakah stack kosong
    public boolean IsEmpty() {
        return (TOP == MIN); 
    }
    
    // Method untuk mengembalikan jumlah elemen dalam stack
    public int size() {
        return TOP + 1; // Mengembalikan jumlah elemen dalam stack
    }
    
    // Method untuk mengembalikan nilai elemen teratas tanpa menghapusnya
    public int top() {
        if (IsEmpty()) {
            return -1; // Nilai default jika stack kosong
        } else {
            return array[TOP]; // Mengembalikan nilai elemen teratas tanpa menghapusnya
        }
    }
    
    // Method untuk menambahkan elemen ke dalam stack (push)
    public void push(int data) {
      if (IsFull()){
          System.out.println("stack penuh");
      }else{
          TOP++;
          array[TOP] = data; // Menambahkan data ke dalam array pada posisi TOP
      }
    }
    
    // Method untuk menghapus dan mengembalikan elemen teratas dari stack (pop)
	public int pop() {
	    if (IsEmpty()) {
	        System.out.println("Stack kosong");
	        return -1; // Nilai default jika stack kosong
	    } else {
	        int data = array[TOP]; // Mengambil data dari elemen teratas
	        TOP--;
	        return data; // Mengembalikan elemen teratas yang dihapus
	    }
	}
	
	// Method untuk menampilkan elemen-elemen dalam stack
	public void DisplayElements() {
	    System.out.print("Elemen from top: ");
	    for (int i = TOP; i >= 0; i--) {
	        System.out.print(array[i] + " ");
	    }
	    System.out.println();
	}

}