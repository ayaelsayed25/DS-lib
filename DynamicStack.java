

package DataStructures;

public class DynamicStack implements IDynamicStack{
    int capacity =0;
    int top = 0;
    Object[] stack;
    public DynamicStack(int capacity)
    {
        this.capacity = capacity;
        stack = new Object[capacity];
    }
    @Override
    public boolean isEmpty()
    {
        return top<=0;
    }
    @Override
    public int size()
    {
        return top;
    }
    @Override
    public void expand()
    {
        int length = size();
        capacity = capacity * 2;
        Object[] newStack = new Object[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }
    @Override
    public void shrink()
    {
        int length = size();
        Object[] newStack;
        if(length <= capacity/4)
        {
            capacity = capacity/2;
            newStack = new Object[capacity];
            System.arraycopy(stack, 0, newStack, 0, length);
            stack = newStack;
        }
    }
    @Override
    public void push(Object data)
    {
        if(size() >= capacity)
            expand();
        stack[top] = data;
        top++;
    }
    @Override
    public Object peek()
    {
        if(isEmpty())
            throw new NullPointerException("Stack is empty!");
        Object data = null;
        data = stack[top-1];
        return data;
    }
    @Override
    public Object pop()
    {
        if(isEmpty())
            throw new NullPointerException("Stack is empty!");
        Object data = null;
        data = stack[top-1];
        stack[top-1] = 0;
        top--;
        shrink();
        return data;
    }
    @Override
    public void show()
    {
        if(isEmpty())
        {
        	System.out.println("Nothing to show!");
        }
        else
        {
        	System.out.print("[");
        	for(int i=0; i<top-1; i++)
            {
                System.out.print(stack[i] + ", ");
            }
            System.out.println(stack[top-1] + "]" );
        }
    }
}
    
