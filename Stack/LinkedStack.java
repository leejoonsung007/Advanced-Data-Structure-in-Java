package assignment3;

public class LinkedStack<E>{
	// inner class
	public class Node{
		Object element;
		Node next;
		
		public Node(Object element) {
			this.element = element;
		}
		
		public String toString() {
			return element.toString();
		}
	}
	
	int size;
	Node top;
	
	// constructor
	public LinkedStack() {
		top = null;
		size = 0;
	}
	
	public void push(Object o) {
		Node node = new Node(o);
		node.next = top;
		top = node;
		size++;
	}
	
	public Object pop() throws EmptyStackException {
		if (top == null) {
			throw new EmptyStackException("Empty stack: cannot pop ");		
		}
		Object e = top.element;
		top.element = null;
		top = top.next;
		size--;
		return e;		
	}
	
	public Object top() throws EmptyStackException{
		if (top == null) {
			throw new EmptyStackException("Empty stack: cannot pop ");		
		}
		return top.element;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	//state visualization
	public String toString() {
		String output = "";
		Node node = top;
		while (node != null) {
			output += node.element.toString() + " ";
			node = node.next;
		}
		
		return "" + size + "\t" + output; 		
	}
}
	

