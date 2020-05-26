
package DataStructures;

public class Stack implements IStack{

    private int size = 0;
    private Node top;
    
/**
* Returns the number of elements in the stack.
*
* @return number of elements in the stack
*/    
    @Override
    public int size()
    {
        return size;
    }
    
/**
* Tests if this stack is empty
*
* @return true if stack empty
*/
    @Override
    public boolean isEmpty()
    {
        return(top == null); 
    }
    
/**
* Pushes an item onto the top of this stack.
*
* @param object
* to insert
*/
    @Override
    public void push(Object data)
    {
        Node node = new Node(data);
        node.setNext(top);
        top = node;
        size++;
    }
    
    @Override
    public void show() 
    {
        if(top == null)
        	System.out.println("Nothing to show!");
        else
        {
        	Node n = top;
            System.out.print("[");
            while(n.getNext() != null)
            {
                System.out.print(n.getData() + ", ");
                n = n.getNext();
            }
            System.out.println( n.getData() + "]");
        }
    }
   
/**
* Removes the element at the top of stack and returns that element.
*
* @return top of stack element, or through exception if empty
*/    
    @Override
    public Object pop()
    {
        if(top == null)
            throw new NullPointerException("Stack is Empty");
        Node n = top;
        top = top.getNext();
        size--;
        return n.getData();
    }
   
/**
* Get the element at the top of stack without removing it from stack.
*
* @return top of stack element, or through exception if empty
*/
    @Override
    public Object peek()
    {
        if(top == null)
            throw new NullPointerException("Stack is Empty");
        return top.getData();
    }
    
    
}