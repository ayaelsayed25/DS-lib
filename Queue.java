
package DataStructures;

public class Queue implements IQueue{   
    int size = 0, front = 0, rear =0, capacity = 0; 
    Object[] queue;
    public Queue (int capacity)
    {
        this.capacity = capacity;
        queue = new Object[capacity]; //A circular Array
    }
    @Override
    public int size()
    {
        return size;
    }
    
    @Override
    public boolean isEmpty()
    {
        return size==0;
    }
    @Override
    public boolean isFull()
    {
        return size==capacity;
    }

    @Override
    public void enqueue(Object data)
    {
        if(!isFull())
        {
            queue[rear] = data;
            rear = (rear + 1)% capacity ;
            size ++;
        }
        else
            throw new NullPointerException("The Queue is already full!");
    }
    
    @Override
    public Object dequeue()
    {
      Object data;  
      if(!isEmpty())
      {
          data = queue[front];
          front = (front+1)%capacity;
          size--;
      }
      else
          throw new NullPointerException("The queue is already empty!");
      return data;
    }
    
    @Override
    public Object front()
    {
        if(isEmpty())
            throw new NullPointerException("The queue is already empty!");
        Object data = queue[front];
        return data;
    }
    
    @Override
    public void show()
    {
        if(isEmpty())
        {
            System.out.println("There is nothing to show!");
        }
        else
        {
        	for(int i= 0; i<size; i++)
            {
                System.out.print(queue[(front + i)%capacity] + " ");
            }
            System.out.println("");
        	
        }
    }
}
