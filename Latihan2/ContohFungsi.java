package Latihan2;

public class ContohFungsi {

	//fungsi untuk melakukan perjumlahan dua bilangan 
	public static int tambah (int a, int b) {
		return a + b ;
	}
	
	//fungsi untuk melakukan perkalian dua bilangan 
	public static int kali (int a, int b) {
		return a * b ;
	}
	
	//fungsi main untuk menjalan kan program 
	public static void main (String[]args ) {
		//memanggil fungsi tambahan dengan parameter 5 + 3 atau 5 dan 3 
		int hasilperjumlahan = tambah(5, 3);
		System.out.println("hasil perjumlahan : " + hasilperjumlahan);
		
		//memanggil fungsi perkalian dengan parameter 4 * 6 atau 4 dan 6
		int hasilperkalian = kali(4, 6);
		System.out.println("hasil perkalian : " + hasilperkalian);
	}
}


//