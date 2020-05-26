package DataStructures;

public interface IQueueLinked {

	public int size();
	public boolean isEmpty();
	public void enqueue(Object data);
	public Object dequeue();
	public Object front();
	public void show();
}
