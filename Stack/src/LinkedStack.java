public class LinkedStack<E> implements Stack<E>{
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

    @Override
    public void push(E o) {
        Node node = new Node(o);
        node.next = top;
        top = node;
        size++;
    }

    @Override
    public E pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException("Empty stack: cannot pop ");
        }
        E temp = (E)top;
        top = top.next;
        size--;
        return temp;
    }

    @Override
    public E top() throws EmptyStackException{
        if (isEmpty()) {
            throw new EmptyStackException("stack is empty ");
        }
        return (E) top;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
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


