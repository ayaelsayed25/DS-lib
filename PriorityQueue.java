package DataStructures;

public class PriorityQueue implements IPriorityQueue{
	PNode head;
	int size = 0;
	
	@Override
	public void insert(Object item, int key) {
		PNode node = new PNode(item, key);
		if(isEmpty())
			head = node;
		else
		{
			if(head.key > key)
			{
				node.next = head;
				head = node;
				size++;
				return;
			}
			PNode n = head;
			while(n.next != null)
			{
				if(n.next.key > key)
				{
					node.next = n.next;
					n.next = node;
					size++;
					return;
				}
				n = n.next;
			}
			n.next = node;
		}
		size++;
	}
	@Override
	public Object removeMin() {
		Object min = head.data;
		head = head.next;
		size--;
		return min;
	}

	@Override
	public Object min() {
		return head.data;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return (size == 0);
	}
	@Override
	public void show()
	{
		if(isEmpty())
			System.out.println("Nothing to show!");
		else
		{
			PNode n = head;
			while( n != null)
			{
				System.out.println("Item : " + n.data + "  Key : " + n.key);
				n = n.next;
			}
		}
	}
}
