
package DataStructures;


public class QueueLinked implements IQueueLinked{
    Node front;
    Node rear;
    int size =0;
    @Override
    public int size()
    {
        return size;
    }
    @Override
    public boolean isEmpty()
    {
        return(front == null);
    }
    
    @Override
    public void enqueue(Object data)
    {
        Node n = new Node(data);
        if(isEmpty())
            front = rear = n;
        else
        {
            rear.setNext(n);
            rear = rear.getNext();
        }
        size++;
    }
    @Override
    public Object dequeue()
    {
        if(isEmpty())
            throw new NullPointerException("The queue is already empty!");
        Object data = front.getData();
        front = front.getNext();
        size--;
        if(front == null)
            rear = null;
        return data;
    }
    @Override
    public Object front()
    {
        if(isEmpty())
            throw new NullPointerException("The queue is already empty!");
        Object data = front.getData();
        return data;
    }
    @Override
    public void show()
    {
    	if(isEmpty())
    		System.out.println("Nothing to show!");
    	else
    	{
    		Node n = front;
            while(n != null)
            {
                System.out.print(n.getData() + " ");
                n = n.getNext();
            } 		
    	}
    }
}
