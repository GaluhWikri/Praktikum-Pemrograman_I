package Latihan6;

public class StrukturListTest {
		public static void main(String[] args) {
	     StrukturList list = new StrukturList();  
	     list.addHead(4);
	     list.addMiddle(3,2);   
	     list.addMiddle(7,3); 
	     list.addMiddle(8,4); 
	     list.addMiddle(1,5); 
	     list.addTail(9);
	     list.displayElement();
	     System.out.print("\n");
	     System.out.print("\n");
	     list.removeAll();
	     System.out.print("\n" );
	     
	    }
	}


