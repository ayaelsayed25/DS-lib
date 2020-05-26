package DataStructures;

public interface IDoublyLinkedList {

	public void insertHead(Object element);
	public void add(int index, Object element);
	public void add(Object element);
	public Object get(int index);
	public void set(int index, Object element);
	public void clear();
	public boolean isEmpty();
	public void remove(int index);
	public int size();
	public boolean contains(Object o);
	public void show();
}
