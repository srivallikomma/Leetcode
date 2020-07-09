package src.main.java.com.komma.Linkedlist;

public class MiddleElementofList {
	Node head;
	class Node{
		Node next;
		int data;
		
	}
	public Node middle() {
		Node p,q;
		p=head;
		q=p.next;
		while(q!=null && q.next != null) {
			p=p.next;
			q=q.next.next;
		}
		return p;
		
	}
	public void insert(int data) {
		Node new_node=new Node();
		new_node.next=null;
		new_node.next=head;
		head=new_node.data;
		
	}
	public void show() {
		Node node=head;
			while(node.next!=null) {
				System.out.println(node.data);
				node=node.next;
			}
			System.out.println(node.data);
			
		}
	
	public static void main(String [] args) 
    { 
		MiddleElementofList llist = new MiddleElementofList(); 
        for (int i=5; i>0; --i) 
        { 
            llist.insert(i); 
        }
           System.out.println("The middle element of the given array is "+ llist.middle());
            llist.show(); 
            
       
    } 

}
