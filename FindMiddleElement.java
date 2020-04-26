public class LinkedList{
 
	private Node head;
 
	private static class Node {
		private int value;
		private Node next;
 
		Node(int value) {
			this.value = value;
 
		}
	}
 
	public void addToTheLast(Node node) {
 
		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;
 
			temp.next = node;
		}
	}
 
 
	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}
 
	// This function will find middle element in linkedlist
	public Node findMiddleNode(Node head)
	{
      Node fast,slow;
	    fast = slow = head;
	    if(head!=null)
	    {
	        while(fast!=null && fast.next!=null)
	        {
	            fast = fast.next.next;
	            slow = slow.next;
	        }
	    }
    return slow;		 
	}
 
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		// Creating a linked list
		Node head=new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));
 
		list.printList();
		// finding middle element
		Node middle= list.findMiddleNode(head);
		System.out.println("Middle node will be: "+ middle.value);
 
	}
 
}
