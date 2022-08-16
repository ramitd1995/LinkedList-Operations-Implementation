package LinkedListOperations;

public class Circular {
	
	Node head;
	Node tail;
	
	class Node
	{
		String data;
		Node next;
		
		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	void add(String str)
	{
		Node newNode = new Node(str);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
		else
		{
			tail.next = newNode;
			tail = tail.next;
			tail.next = head;
		}
		
	}
	
	void delete(int pos)
	{
		Node current = head;
		
		for(int i=1;i<pos-1;i++)
		{
			current = current.next;
		}
		
		current.next = current.next.next;
	}
	
	void deleteSpecific(String str)
	{
		Node current = head;
		
		do
		{
			if(current.next.data.equals(str))
			{
				current.next = current.next.next;
				break;
			}
			current = current.next;
		}
		while(current != head);
		
	}
	
	void findElement(String str)
	{
		Node current = head;
		
		do
		{
			if(current.data.equals(str))
			{
				System.out.println(str + " is present in list");
				break;
			}
			current = current.next;
		}
		while(current != head);
	}
	
	void display()
	{
		Node current = head;
		
		do
		{
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		while(current != head);
		
		System.out.println("Null");
	}
	
	public static void main(String[] args) {
		
		Circular obj = new Circular();
		
		obj.add("Dhamija");
		obj.add("Ramit");
		obj.add("17/07/1995");
		obj.add("New Delhi");
		obj.display();
		
		obj.findElement("New Delhi");
		
		obj.deleteSpecific("17/07/1995");
		obj.display();
		
		obj.delete(2);
		obj.display();
		
	}

}
