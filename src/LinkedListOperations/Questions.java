package LinkedListOperations;

public class Questions {
	
	// 1. Find and delete nth node from the end of linked list
	// 2. Check if LinkedList is a Palindrome
	
	Node head;
	
	class Node
	{
		String data;
		Node next;
		
		Node(String str)
		{
			this.data=str;
			this.next=null;
		}
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
	
	void findAndDelete(int endPos)
	{
		Node current = head;
		int count=0;
		
		while(current != null)
		{
			count++;
			current = current.next;
		}
		
		int del = count - endPos + 1;
		
		current = head;
		
		for(int i=1;i<del-1;i++)
		{
			current = current.next;
		}
		
		current.next = current.next.next;
	}
	
	boolean isPalindrome()
	{
		Node current = head;
		String s = "";
		String temp = "";
		
		while(current != null)
		{
			s = s + current.data;
			current = current.next;
		}
		
		for(int i=s.length()-1;i>=0;i--)
		{
			temp = temp + s.charAt(i);
		}
		
		return s.equals(temp);
	}
	
	public static void main(String[] args) {
		
		Questions obj = new Questions();
		obj.addLast("l");
		obj.addLast("e");
		obj.addLast("v");
		obj.addLast("e");
		obj.addLast("l");
		obj.printList();
		
		System.out.println("Is Palindrome :"+ obj.isPalindrome());
		
		obj.findAndDelete(2);
		obj.printList();
		
		System.out.println("Is Palindrome :"+ obj.isPalindrome());

		
	}

}
