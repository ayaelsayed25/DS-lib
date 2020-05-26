package DataStructures;

public interface IQueue {

	public int size();
	public boolean isEmpty();
	public boolean isFull();
	public void enqueue(Object data);
	public Object dequeue();
	public Object front();
	public void show();
	
}
