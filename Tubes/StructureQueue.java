package Tubes;

public class StructureQueue {
    private int N = 5; // Ukuran maksimum antrian
    private String[] queue = new String[N]; // Array untuk menyimpan elemen antrian
    private int front = -1; // Indeks depan antrian
    private int rear = -1; // Indeks belakang antrian
    
    // Method untuk memeriksa apakah antrian kosong
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }	

    // Method untuk memeriksa apakah antrian penuh
    public boolean isFull() {
        return (rear + 1) % N == front;
    }

    // Method untuk menambahkan elemen ke antrian
    public void enqueue(String antrean) {
        // Jika antrian kosong
        if (front == -1 && rear == -1) {
            front = rear = 0;
            queue[rear] = antrean;
        // Jika antrian penuh
        } else if (isFull()) {
            System.out.println("Antrean Bank Penuh.");
        // Jika antrian tidak penuh
        } else {
            rear = (rear + 1) % N;
            queue[rear] = antrean;
        }
    }

    // Method untuk menghapus elemen dari antrian
    public void dequeue() {
        // Jika hanya ada satu elemen di antrian
        if (front == rear && front != -1 && rear != -1) {
            front = rear = -1;
        // Jika antrian kosong
        } else if (isEmpty()) {
            System.out.println("Antrean Bank Kosong.");
        // Jika antrian tidak kosong
        } else {
            front = (front + 1) % N;
        }
    }

    // Method untuk mendapatkan elemen di depan antrian tanpa menghapusnya
    public String getFront() {
        String value = null;
        // Jika antrian kosong
        if (isEmpty()) {
            value = "Antrean bank Kosong.";
        // Jika antrian tidak kosong
        } else {
            value = queue[front];
        }
        return value;
    }
    
    // Method untuk menampilkan semua elemen di antrian
    public void displayQueue() {
        // Jika antrian kosong
        if (isEmpty()) {
            System.out.println("Antrean Bank Kosong.");
        // Jika antrian tidak kosong
        } else {
            System.out.println("Antrean: ");
            int current = front;
            // Iterasi dari front ke rear
            while (current != rear) {
                System.out.println(queue[current]);
                current = (current + 1) % N;
            }
            // Menampilkan elemen terakhir di antrian
            System.out.println(queue[current]);
        }
    }
    
    // Method untuk menampilkan status saat ini dari array queue
    public void displayArray() {
        System.out.println("Current state of the array:");
        for (int i = 0; i < N; i++) {
            if (queue[i] == null) {
                System.out.println("Index " + i + ": null");
            } else {
                System.out.println("Index " + i + ": " + queue[i]);
            }
        }
    }
}
