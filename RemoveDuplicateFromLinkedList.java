/*

*/


class GfG
{
    // head: head node
    Node removeDuplicates(Node head)
    {
        Node current = head;
        
        while(current!=null)
        {
            Node temp = current;
            
            while(temp!=null && temp.data==current.data)
            {
                temp = temp.next;
            }
            current.next = temp;
            current = current.next;
        }
	    return head;
    }
}
