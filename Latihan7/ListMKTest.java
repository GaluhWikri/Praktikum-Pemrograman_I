package Latihan7;

public class ListMKTest {
    public static void main(String[] args) {

    	// LIST TES-1
//    ListMataKuliah list = new ListMataKuliah();
//    list.addHead(new MataKuliah("If004,", "Konstruksi PL Beriontasi Objek, ", 3));
//    list.addHead(new MataKuliah("If003,", "Struktur Distrit, ", 3));
//    list.addHead(new MataKuliah("If002,", "Pemrograman Web, ", 3));
//    list.addHead(new MataKuliah("If001,", "Dasar Pemrograman, ", 4));
// 	  list.displayElement();

    	//LIST TES-4 
	ListMataKuliah list1 = new ListMataKuliah();
    list1.addTail(new MataKuliah("If004", "Konstruksi PL Beriontasi Objek, ", 3));
    list1.addTail(new MataKuliah("If003", "Struktur Distrit, ", 3));
    list1.addMiddle(new MataKuliah("if002", "Pemrograman Web, ", 3), 1 );
	list1.addHead(new MataKuliah("If001", "Dasar Pemrograman, ", 3));
	list1.displayElement();
    }
}