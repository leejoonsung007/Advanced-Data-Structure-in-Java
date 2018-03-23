package assignment3;

public class ArrayStack<E> implements Stack<E>{
	private E S[]; //An array of objects
	private int N = 1000; //Array size
	private int t = -1; //top index
	
	//constructor
	public ArrayStack() {
		S = (E[])(new Object[N]);
	}
	// constructor
	public ArrayStack(int capacity) {
		S = (E[]) new Object[capacity];
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return t+1;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public E top() throws EmptyStackException {
		// TODO Auto-generated method stub
		if (isEmpty())
			throw new EmptyStackException("Stack is empty");
		return S[t];
	}
	@Override
	public void push(E element) throws FullStackException{
		// TODO Auto-generated method stub
		if(size() == N) {
			throw new FullStackException("Stack is full");
		}
		S[++t] = element;
		
	}
	@Override
	public E pop() throws EmptyStackException {
		// TODO Auto-generated method stub
		if  (isEmpty())
			throw new EmptyStackException("Empty stack: cannot pop");
		E temp = S[t];
		S[t] = null;
		t = t - 1;
		return temp;
	}
	
	public String toString() {
	    String s = "";
	    int number = 0;
//	    generate the number
	    for(int j = 0; j <= size(); j++) {
	    		number = j;
	    }
	    if (size() > 0) {
	    		s+= S[0];
	    }
	    if (size() > 1) {
	      for (int i = 1; i <= size()-1; i++) {
	    	  	s += " " + S[i];
	      }
	    }
	    return Integer.toString(number) + "     " + s;
	  }
	
}
