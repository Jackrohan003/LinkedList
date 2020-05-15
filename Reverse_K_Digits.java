class GfG
{
    public static Node reverse(Node node, int k)
    {
        Node prev = null;
        Node current = node;
        Node next=null;
        
        int cnt =0;
        while(current != null && cnt<k)
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            cnt++;
        }
        
        if(next !=null)
            node.next = reverse(next,k);
            
        return prev;    
    }
}
