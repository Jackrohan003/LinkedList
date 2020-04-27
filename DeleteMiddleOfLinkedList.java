/*
https://practice.geeksforgeeks.org/problems/delete-middle-of-linked-list/1
*/




class GFG {
    Node Delete(Node head) {
        // This is method only submission.
        // You only need to complete the method.
        
        if(head==null || head.next==null)
        return null;
        
        
        Node fast,slow;
        fast = slow = head;
        Node prev=null;
        
        while(fast!=null && fast.next!=null)
        {
            prev =slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
        
        
    }
}
