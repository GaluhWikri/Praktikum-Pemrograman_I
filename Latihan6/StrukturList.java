package Latihan6;


public class StrukturList {
				node HEAD;
		    
		    //fungsi menambahkan data AddHead List
		    public void addHead(int data) {
		        node newnode = new node(data);
		        if (isEmpty()) {
		            HEAD = newnode;
		        } else {
		            newnode.setNext(HEAD);
		            HEAD = newnode;
		        }
		    }
		    
		    //fungsi menambahkan data di depan
		    public void addTail(int data) {
		        node newnode = new node(data);
		        if (isEmpty()) {
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
		    public void addMiddle(int data, int pos) {
		        node newnode = new node(data);
		        node curNode = HEAD;
		        if (isEmpty()) {
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

		    // menampilkan isi linked list
		    public void displayElement() {
		        node curNode = HEAD;

		        while(curNode != null) {
		            System.out.print(curNode.getData()+ " ");
		            curNode = curNode.getNext();
		        }
		   }
		    
		    //cek apakah linked list kosong
		    public boolean isEmpty() {
		        return HEAD == null;
		    }
		    
		    public void dispose(node node) {
		    	
		    }
		
		    //Fungsi removeHead
			public void removeHead() {
				if (isEmpty()) {
					System.out.println("list kosong");
				}else {
					node temp = HEAD;
					HEAD = HEAD.getNext();
					dispose (temp);
				}
			}
			
			//fungsi removeTail
			public void removeTail() {
				node preNode = null, lastNode;
				
			        if (HEAD.getNext() == null) {
			            HEAD = null;
			            System.out.println("List kosong");
			        } else {
			        	lastNode = HEAD;
			            while (lastNode.getNext() != null) {
			                preNode = lastNode;
			                lastNode = lastNode.getNext();
			            }
			            preNode.setNext(null);
			            dispose(lastNode);
			        }
			    }
			

			// Fungsi removemid
			public void removeMid(int a) {
				node preNode = new node(0);
				node tempNode;
				int i;
				boolean ketemu;

				if (isEmpty()) {
					System.out.println("Elemen list kosong");
				} else {
					ketemu = false;
					i = 1;
					tempNode = HEAD;
					while (tempNode.getNext() != null && !ketemu) {
						if (tempNode.getData() == a) {
							ketemu = true;
						} else {
							preNode = tempNode;
							tempNode = tempNode.getNext();
							i++;
						}
					}

					if (ketemu == true) {
						if (i == 1) {
							HEAD = null;
						} else {
							preNode.setNext(tempNode.getNext());
							}
						}
					}
				}
					// fungsi find list
					public boolean find(int x) {
						node curNode = HEAD ;
						boolean ketemu = false;
						 while (curNode != null && !ketemu)
						 {
							 if (curNode.getData() == x)
								 ketemu = true;
							 else
								 curNode = curNode.getNext();
						 }
						 return ketemu;
						}
					
					//fungsi sis list
				public int size() {
						int count = 0;
						node curNode = HEAD;
    
						while (curNode != null) {
							count++;
							curNode = curNode.getNext();
						}
 						return count;
					}
				
					//fungsi remove all 
				public void removeAll() {
						HEAD = null;
							System.out.println("List kosong");
						while  (HEAD != null){
							removeTail();
					    	}
						}
					}
			  	
							    

			

