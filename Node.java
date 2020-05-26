
package DataStructures;

public class Node {
    Node next;
    Object data;
    Node prev;

    public Node()
    {
    	
    }
    public Node( Object data)
    {
        this.data = data;
    }
    
    public Object getData()
    {
        return data;
    }
    public Node getNext()
    {
        return next;
    }
    public void setNext(Node next)
    {
        this.next = next;
    }
    public void setData(Object data)
    {
        this.data = data;
    }
    public void setPrev(Node prev)
    {
        this.prev = prev;
    }
    public Node getPrev()
    {
        return prev;
    }
}
