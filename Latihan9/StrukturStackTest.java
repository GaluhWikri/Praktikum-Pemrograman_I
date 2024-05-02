package Latihan9;


public class StrukturStackTest {
    public static void main(String [] args){
        StrukturStack stack = new StrukturStack(3);

        // Sebelum push
        System.out.println("# sebelum push");
        System.out.println("size = " + stack.size());
        System.out.println("empty = " + stack.IsEmpty());
        System.out.println("full = " + stack.IsFull());
        System.out.println("top = " + stack.top());
        stack.DisplayElements();
        
        // Melakukan push 3x
        System.out.println("# melakukan push 3X");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Setelah push 3x
        System.out.println("size = " + stack.size());
        System.out.println("empty = " + stack.IsEmpty());
        System.out.println("full = " + stack.IsFull());
        System.out.println("top = " + stack.top());
        stack.DisplayElements();
        
        //melakukan pop 3X
        System.out.println("# melakukan Pop 3x");
        stack.pop();
        stack.pop();
        stack.pop();
        
        // setelah melakukan pop 3x
        System.out.println("# setelah Pop 3x");
        System.out.println("pop = " + stack.pop());
        System.out.println("size = " + stack.size());
        System.out.println("empty = " + stack.IsEmpty());
        System.out.println("full = " + stack.IsFull());
        System.out.println("top = " + stack.top());
        stack.DisplayElements();
    }
}