package com.komma.Linkedlist;

public class LinkedListAllBasic {
	public class Node{
		int data;
		Node next;
		public Node() {
			
			next=null;
		}
	}
 Node head;
	public void insertdata(int data) {
		Node new_node=new Node();
		   new_node.data=data;
		   new_node.next=null;
		
		if(head==null) {
			head =new_node;
		}
		
		else {
			Node tempnode=head;
			while(tempnode.next!=null) {
				tempnode=tempnode.next;
			}
			tempnode.next=new_node;
		}
	}
	public void insertAtStart(int data) {
		   Node new_node=new Node();
		   new_node.data=data;
		   new_node.next=null;
		   new_node.next=head;
		   head=new_node;
	}
	public void insertAtIndex(int index,int data) {
		 Node new_node=new Node();
		 Node n=new Node();
		 n=head;
		   new_node.data=data;
		   new_node.next=null;
		   if(index==0) {
			   insertAtStart(data);
		   }
		   else {
		   for(int i=0;i<index-1;i++) {
			   n=n.next;
		   }
		   new_node.next=n.next;
		   n.next=new_node;
		   }
	}
	public void deletAt(int index) {
		Node n=head,tempnode;
		if(index==0) {
			head=head.next;
		}
		else {
			   for(int i=0;i<index-1;i++) {
				   n=n.next;
			   }
			   tempnode=n.next;
			   n.next=tempnode.next;
			   }
		tempnode=null;
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
		
	}
	public static void main(String args[]) {
		LinkedListAllBasic llist=new LinkedListAllBasic();
		llist.insertdata(5);
		llist.insertdata(10);
		llist.insertdata(15);
		llist.insertdata(20);
		System.out.println("after insert");
		llist.show();
		llist.insertAtStart(1);
		System.out.println("after insertat start");
		llist.show();
		llist.insertAtIndex(2, 25);
		System.out.println("after insertatindex");
		llist.show();
		llist.deletAt(2);
		System.out.println("after delete");
		llist.show();
		
	}
}
