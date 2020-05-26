package DataStructures;

public interface IDynamicStack {

	public boolean isEmpty();
	public int size();
	public void expand();
	public void shrink();
	public void push(Object data);
	public Object peek();
	public Object pop();
	public void show();
	
}
