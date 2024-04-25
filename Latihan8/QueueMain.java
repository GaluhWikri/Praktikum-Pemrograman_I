package Latihan8;

public class QueueMain {
    public static void main(String[] args) {
// Latihan 4
        // Membuat objek queue dari kelas StrukturQueue
        StrukturQueue queue = new StrukturQueue();

        // Menampilkan informasi sebelum proses enqueue dilakukan
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("Size : " + queue.size()); // Menampilkan jumlah elemen dalam antrian
        System.out.println("isEmpty: " + queue.isEmpty()); // Menampilkan apakah antrian kosong atau tidak

        // Proses enqueue untuk menambahkan elemen ke dalam antrian
        queue.enqueue(3);
        queue.enqueue(3);
        queue.enqueue(3);

        // Menampilkan informasi setelah proses enqueue dilakukan
        System.out.println("\n### Enqueue 3x ###");
        System.out.println("Size : " + queue.size()); // Menampilkan jumlah elemen dalam antrian
        System.out.println("isEmpty: " + queue.isEmpty()); // Menampilkan apakah antrian kosong atau tidak
        System.out.println("Front : " + queue.front());  // Menampilkan elemen pertama (front) dalam antrian
        
        queue.dequeue();
        queue.displayElement();
    }
}

////latihan 5
//    public static void main(String[] args) {
//        StrukturQueue queue = new StrukturQueue();
//
//        // Menampilkan informasi sebelum proses enqueue dilakukan
//        System.out.println("### Sebelum Enqueue 4x ###");
//        System.out.println("Size : " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        queue.displayElement(); // Menampilkan elemen sebelum enqueue
//        System.out.println();
//
//        // Enqueue 4 elemen ke dalam antrian
//        queue.enqueue(2);
//        queue.enqueue(7);
//        queue.enqueue(6);
//        queue.enqueue(1);
//
//        // Menampilkan informasi setelah enqueue 4x
//        System.out.println("### Setelah Enqueue 4x ###");
//        System.out.println("Size : " + queue.size());
//        System.out.println("isEmpty: " + queue.isEmpty());
//        queue.displayElement(); // Menampilkan seluruh elemen dalam antrian setelah enqueue
//        System.out.println("Front : " + queue.front());
//        
//        queue.dequeue();
//        queue.displayElement();
//    }
//}




	

