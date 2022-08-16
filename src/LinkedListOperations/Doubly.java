package LinkedListOperations;

import LinkedListOperations.Singly.Node;

public class Doubly {
	
	Node head;
	
	class Node
	{
		String data;
		Node prev;
		Node next;
		
		public Node(String data) {
			this.data = data;
			this.prev = null;
			this.next = null;
		}
	}
	
	void addFirst(String str)
	{
		Node newNode = new Node(str);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		head.prev = newNode;
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(String str)
	{
		Node newNode = new Node(str);
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = newNode;
		newNode.prev = current;
	}
	
	void addAtPos(String str, int pos)
	{
		Node newNode = new Node(str);
		Node current = head;
		
		for(int i=1;i<pos-1;i++)
		{
			current = current.next;
		}
		
		newNode.next = current.next;
		(current.next).prev = newNode;
		current.next = newNode;
		newNode.prev = current;
	}
	
	void deleteFirst()
	{
		if(head==null)
		{
			System.out.println("List is empty");
			return;
		}
		
		head = head.next;
	    (head.prev).next = null;
		head.prev = null;
	}
	
	void deleteLast()
	{
		Node current = head;
		
		while(current.next.next != null)
		{
			current = current.next;
		}
		
		(current.next).prev = null;
		current.next = null;
	}
	
	void deleteAtPos(int pos)
	{
		Node current = head;
		
		for(int i=1;i<pos;i++)
		{
			current = current.next;
		}	
		
		(current.next).prev = current.prev;
		(current.prev).next = current.next;
		
		current = null;
	}
	
	void printList()
	{
		Node current = head;
		
		while(current != null)
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		
		System.out.println("Null");
	}
	
	void printReverse()
	{
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		while(current != head.prev)
		{
			System.out.print(current.data + " -> ");
			current = current.prev;
		}
		
		System.out.println("Null");
	}
	
	 void reverse()
	    {
	        Node temp = null;
	        Node current = head;
	  
	        /* swap next and prev for all nodes of
	         doubly linked list */
	        while (current != null) {
	            temp = current.prev;
	            current.prev = current.next;
	            current.next = temp;
	            current = current.prev;
	        }
	  
	        /* Before changing head, check for the cases like
	         empty list and list with only one node */
	        if (temp != null) {
	            head = temp.prev;
	        }
	    }
	
	public static void main(String[] args) {
		
		Doubly obj = new Doubly();
		
		obj.addFirst("Dhamija");
		obj.addFirst("Ramit");
		obj.printList();
		
		obj.addLast("Organisation");
		obj.addLast("FarEye");
		obj.printList();
		
		obj.printReverse();
		
		obj.addAtPos("My",3);
		obj.printList();
		
		obj.deleteFirst();
		obj.printList();
		
		obj.deleteLast();
		obj.printList();
		
		obj.deleteAtPos(2);
		obj.printList();
		
		obj.addLast("Noida");
		obj.addLast("UP-201301");
		obj.printList();
		obj.reverse();
		obj.printList();
		
	}

}
