/*
https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1
*/



class Solution {
    
    public Node insertInMid(Node head, int data){

        Node temp = new Node(data);
        
        if(head==null)
        {
            head =temp;
            return head;
        }

        Node slow,fast;
        slow = fast = head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        temp.next = slow.next;
        slow.next = temp;
        
        return head;
    }
}
