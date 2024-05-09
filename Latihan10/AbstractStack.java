package Latihan10;

//Kelas abstrak untuk representasi umum dari struktur data stack
public class AbstractStack 
	{
		protected int[] array;// Array untuk menyimpan elemen-elemen stack
		protected int capacity; // Kapasitas maksimum stack
		protected int TOP;// Indeks dari elemen teratas stack
		
		public final int MIN=-1;// Konstanta untuk nilai minimum indeks
		
		// Konstruktor untuk membuat objek AbstractStack dengan kapasitas tertentu
		public AbstractStack(int capacity) {
			array = new int[capacity];// Inisialisasi array dengan kapasitas yang ditentukan	
			this.capacity = capacity;// Inisialisasi kapasitas maksimum stack
			TOP = MIN;// Inisialisasi indeks elemen teratas dengan nilai minimum
		}
		
		// Metode untuk menambahkan elemen ke dalam stack
		public void push(int data)
		{
			if (!isFull()) {
				TOP++;
				array[TOP]=data;
			}
			else
				System.out.println("Stack Penuh...");
		}
		
		// Metode untuk menghapus dan mengembalikan elemen teratas dari stack
		public int pop()
		{
			int data = -1;
			if (!isEmpty()) {
				TOP--;
				data = array[TOP+1];
			}
			else
				System.out.println("Stack Kosong...");
			
			return data;
		}
		
		// Metode untuk mengecek apakah stack penuh
		public boolean isFull()
		{
			return TOP == (capacity-1) ? true : false;
		}
		
		// Metode untuk mengecek apakah stack kosong
		public boolean isEmpty()
		{
			return TOP == MIN;
		}

		// Metode untuk mengembalikan jumlah elemen pada stack
		public int size() 
		{
			return TOP+1;
		}

		// Metode untuk mengembalikan nilai dari elemen teratas stack tanpa menghapusnya
		public int top() 
		{
			return isEmpty() ? -1 : array[TOP];
		}

		// Metode untuk menampilkan isi stack
		public String displayStack() {
			String elemen = "";
			for (int i = TOP; i > MIN; i--) {
				elemen=elemen+ array[i]+ " ";// Membuat string dari elemen-elemen stack
			}
			return elemen;// Mengembalikan string yang berisi elemen-elemen stack
		}
	}

