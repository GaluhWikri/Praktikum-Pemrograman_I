package Latihan4;

public class StrukturList {
    private Node HEAD;
    
    //cek apakah linked list kosong
    public boolean isEmpty() {
        return HEAD == null;
    }
    
    //fungsi menambahkan data AddHead List
    public void addHead(double data) {
        Node newNode = new Node (data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    //fungsi menambahkan data di depan
    public void addTail(double data) {
        Node newNode = new Node (data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;
            Node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newNode);
        }
    }

    //fungsi menambahkan data di tengah
    public void addMiddle(double data, int pos) {
        Node newNode = new Node (data);
        Node curNode = HEAD;
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            Node posNode = null;
            if (pos == 1) {
                newNode.setNext(HEAD);
                HEAD = newNode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newNode);
                newNode.setNext(curNode);
            }
        }
    }

    // menampilkan isi linked list
    public void displayElement() {
        Node curNode = HEAD;

        while(curNode != null) {
            System.out.print(curNode.getData()+ " ");
            curNode = curNode.getNext();
        }
    }
}

