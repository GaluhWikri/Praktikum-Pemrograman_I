package Latihan7;


public class node {
	private MataKuliah data;
	private node next;

	public node(MataKuliah data) {
	   this.data = data;
	}
	
    public void setData(MataKuliah data) {
        this.data = data;
    }
    
	public void setNext(node next) {
	    this.next = next;
	}

	public MataKuliah getData() {
	    return data;
	}

	public node getNext() {
	    return next;
	}
}


