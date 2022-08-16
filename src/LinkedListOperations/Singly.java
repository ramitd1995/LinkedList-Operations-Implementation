package LinkedListOperations;

public class Singly {
	
	Node head;
	
	class Node{
		
		String data; 
		Node next;
		
		Node(String data)
		{
			this.data = data;
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
		
		newNode.next = head;
		head = newNode;
	}
	
	void addLast(String str)
	{
		Node newNode = new Node(str);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node current = head;
		
		while(current.next != null)
		{
			current = current.next;
		}
		
		current.next = newNode;
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
	
	void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		
		head = head.next;
	}
	
	void deleteLast()
	{
		Node current = head;
		
		while(current.next.next != null)
		{
			current = current.next;
		}
		
		current.next = null;
	}
	
	int getListSize()
	{
		Node current = head;
		int size=0;
		
		while(current != null)
		{
			current = current.next;
			size++;
		}
		
		return size;
	}
	
	void addAtPos(String str, int pos)
	{
		Node prev = head;
		Node newNode = new Node(str);
		
		for(int i=1;i<pos-1;i++)
		{
			prev = prev.next;
		}
		
		newNode.next = prev.next;
		prev.next = newNode;
	}
	
	void deleteAtPos(int pos)
	{
		Node prev = head;
	
		for(int i=1;i<pos-1;i++)
		{
			prev = prev.next;
		}
		
		prev.next = prev.next.next;
	}
	
	void reverse()
	{
		Node current = head.next;
		Node prev = head;
		
		while(current !=null)
		{
			Node temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		
		head.next = null;
		head = prev;
	}
	
	public static void main(String[] args) {
		
		Singly obj = new Singly();
		
		obj.addFirst("Dhamija");
		obj.addFirst("Ramit");
		obj.printList();
		
		obj.addLast("Organisation");
		obj.addLast("FarEye");
		obj.printList();
		
		obj.addAtPos("The",2);
		obj.printList();
		
		obj.deleteFirst();
		obj.printList();
		
		obj.deleteAtPos(3);
		obj.printList();
		
		obj.deleteLast();
		obj.printList();
		
		System.out.println("Size of linked list is: "+obj.getListSize());
		
		obj.addLast("Noida");
		obj.addLast("UP-201301");
		obj.printList();
		obj.reverse();
		obj.printList();
		
	}

}
