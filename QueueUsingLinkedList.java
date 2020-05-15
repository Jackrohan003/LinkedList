

class MyQueue
{
    QueueNode  front, rear;
    
    // This function should add an item at
    // rear
	void push(int a)
	{
        // Your code here
        QueueNode temp = new QueueNode(a);

        if(front == null && rear == null)
        {
            front = rear = temp;
        }
        else
        {
            rear.next = temp;
            rear = temp;
        }
        
	}
	
    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
        // Your code here
        if(front==null)
        {
            return -1;
        }
        int x = front.data;
        front = front.next;
        
    
        if(front==null)
            rear = null;
        return x;        
	}
}
