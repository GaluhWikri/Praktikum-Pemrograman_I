package Latihan7;


public class ListMataKuliah {
		node HEAD;
		int position;
		
    //fungsi menambahkan data AddHead List
    public void addHead(MataKuliah data) {
    	node newnode = new node (data);
        if (HEAD == null) {
            HEAD = newnode;
        } else {
            newnode.setNext(HEAD);
            HEAD = newnode;
        }
    }
    
    // menampilkan isi linked list
    public void displayElement() {
        if(HEAD == null) {
            System.out.println("List Kosong");
        } else {
            node curNode = HEAD;
            while (curNode != null) {
                MataKuliah mataKuliah = curNode.getData(); // Ambil objek MataKuliah dari node saat ini
                System.out.println("Mata Kuliah : " + mataKuliah.getKode() +   mataKuliah.getNama()  + mataKuliah.getSks());
                curNode = curNode.getNext();
            }
            System.out.println();
        }
    }
    //fungsi menambahkan data di depan
    public void addTail(MataKuliah data) {
        node newnode = new node(data);
        if (HEAD == null) {
            HEAD = newnode;
        } else {
            node curNode = HEAD;
            node posNode = null;
            while (curNode != null) {
                posNode = curNode;
                curNode = curNode.getNext();
            }
            posNode.setNext(newnode);
        }
    }

    //fungsi menambahkan data di tengah
    public void addMiddle(MataKuliah data, int pos) {
        node newnode = new node(data);
        node curNode = HEAD;
        if (HEAD == null) {
            HEAD = newnode;
        } else {
            node posNode = null;
            if (pos == 1) {
                newnode.setNext(HEAD);
                HEAD = newnode;
            } else {
                int i = 1;
                while (curNode != null && i < pos) {
                    posNode = curNode;
                    curNode = curNode.getNext();
                    i++;
                }
                posNode.setNext(newnode);
                newnode.setNext(curNode);
            }
        }
     }
}
