package Latihan5;

public class StrukturListTest {
	public static void main(String[] args) {
     StrukturList list = new StrukturList();
     list.addHead(2);
     list.addMiddle(6,2);
     list.addMiddle(3,3);
     list.addMiddle(5,4);     
     list.addTail(1);
     list.displayElement();
     list.removeMid(3);
     System.out.println("");
     list.displayElement();
    }
}
