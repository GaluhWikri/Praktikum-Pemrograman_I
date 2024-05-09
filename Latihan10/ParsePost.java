package Latihan10;

public class ParsePost {
    private MyStack stack;
    private String input;

    // Konstruktor untuk membuat objek ParsePost dengan ekspresi postfix tertentu
    public ParsePost(String input) {
        this.input = input;
    }
    
    // Metode untuk melakukan parsing dan evaluasi ekspresi postfix
    public int doParse() {
        stack = new MyStack(20);// Membuat objek MyStack dengan kapasitas 20
        char ch;
        int i;
        int bil1, bil2, hasilOps;

        for (i = 0; i < input.length(); i++) {
            ch = input.charAt(i);

            if (ch >= '0' && ch <= '9') {  // Jika karakter adalah operasi bilangan
                stack.push((int) (ch - '0'));// Push operand ke stack
            } else {// Jika karakter adalah operato
                bil1 = stack.pop(); //pop bilangan 1
                bil2 = stack.pop();	//pop bilangan 2
                switch (ch) {
                    case '+':
                    	// Melakukan operasi penjumlahan
                        hasilOps = bil1 + bil2;
                        break;
                    case '-':
                    	// Melakukan operasi pengurangan
                        hasilOps = bil1 - bil2;
                        break;
                    case '*':
                    	// Melakukan operasi perkalian
                        hasilOps = bil1 * bil2;
                        break;
                    case '/':
                    	// Melakukan operasi pembagian
                        hasilOps = bil1 / bil2;
                        break;
                    default:
                        hasilOps = 0;
                        break;
                }
                stack.push(hasilOps);// Push hasil operasi ke stack
            }
        }
        hasilOps = stack.pop();	// Mengambil hasil akhir dari stack
        return hasilOps; // Mengembalikan hasil evaluasi
    }
}
