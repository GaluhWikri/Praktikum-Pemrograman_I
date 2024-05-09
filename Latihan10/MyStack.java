package Latihan10;

public class MyStack extends AbstractStack {
	// Konstruktor untuk membuat objek MyStack dengan kapasitas tertentu
    public MyStack(int capacity) {
        super(capacity);// Memanggil konstruktor kelas induk (AbstractStack)
    }
    
    // Metode untuk menampilkan isi stack
    public void displayStack(String s) {
        System.out.println(s);
        System.out.println("Stack (bottom-->): ");
        for (int i = 0; i <= TOP; i++) {
            System.out.println(array[i]);
            System.out.println(); // Baris kosong setiap elemen stack ditampilkan
        }
        System.out.println(""); // Baris kosong setelah seluruh isi stack ditampilkan
    }
    public int peekn(int n) {
        return array[n];
    }
}

    
