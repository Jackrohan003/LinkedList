
class MyStack {

    // Note that top is by default null
    // in Java
    StackNode top;
    void push(int a) {
        
            StackNode temp = new StackNode(a);
            if(top==null)
            {
                top = temp;
            }
            else
            {
                temp.next = top;
                top = temp;
            }
     
    }
    int pop() {
        // Add your code here
        if(top==null)
        {
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
       
    }
}
