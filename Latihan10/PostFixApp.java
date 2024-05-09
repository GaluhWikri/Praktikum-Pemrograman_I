package Latihan10;

import java.io.IOException;
import java.util.Scanner;


public class PostFixApp {
	
	private static Scanner scanner;

	public static void main(String[]args) throws IOException {
		String input;
		int output;
		
		while(true) {
			System.out.println("Enter PostFix : ");
			System.out.flush();
			input = getString();// Menerima input ekspresi postfix dari pengguna
			if (input.equals(""))
				break;
			
			// Membuat objek ParsePost untuk memproses ekspresi postfix
			ParsePost aParser = new ParsePost(input); 
			output = aParser.doParse(); // Melakukan parsing dan evaluasi ekspresi postfix
			System.out.println("Hasil operasi : "+ output);// Menampilkan hasil evaluasi
		}
	}
	
	// Metode untuk membaca input dari pengguna
	public static String getString()throws IOException{
		scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return s;
	}
}
