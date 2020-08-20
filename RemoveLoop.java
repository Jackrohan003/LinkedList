// Java program to detect and remove loop in linked list 

class LinkedList { 

	static Node head; 

	static class Node { 

		int data; 
		Node next; 

		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	// Function that detects loop in the list 
	int detectAndRemoveLoop(Node node) 
	{ 
		Node slow = node, fast = node; 
		while (slow != null && fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next; 

			// If slow and fast meet at same point then loop is present 
			if (slow == fast) { 
				removeLoop(node, fast); 
				return 1; 
			} 
		} 
		return 0; 
	}
  void detect(Node node) 
	{ 
		Node slow = node, fast = node; 
		while (slow != null && fast != null && fast.next != null) { 
			slow = slow.next; 
			fast = fast.next.next; 

			// If slow and fast meet at same point then loop is present 
			if (slow == fast) { 
				System.out.println("Loop Exist"); 
				break;
			} 
		} 
		System.out.println("Not");
	}

	// Function to remove loop 
	void removeLoop(Node start, Node fast) 
	{ 
		Node slow = start;
      	while(slow.next!=fast.next)
        {
        	slow = slow.next;
          	fast = fast.next;
        }
      fast.next =null;
	} 

	// Function to print the linked list 
	void printList(Node node) 
	{ 
		while (node != null) { 
			System.out.print(node.data + " "); 
			node = node.next; 
		} 
	} 

	// Driver program to test above functions 
	public static void main(String[] args) 
	{ 
		LinkedList list = new LinkedList(); 
		list.head = new Node(50); 
		list.head.next = new Node(20); 
		list.head.next.next = new Node(15); 
		list.head.next.next.next = new Node(4); 
		list.head.next.next.next.next = new Node(10); 

		// Creating a loop for testing 
		head.next.next.next.next.next = head.next.next;
      list.detect(head);
		list.detectAndRemoveLoop(head); 
		System.out.println("Linked List after removing loop : "); 
		list.detect(head);
      	list.printList(head); 
	} 
} 

