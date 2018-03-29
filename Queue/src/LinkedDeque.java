public class LinkedDeque<E> implements Deque<E> {

    private class Node{
        E element;
        Node next;
        Node prev;

        // constructor
        public Node(E value) {
            element = value;
        }
    }
    //attribute
    Node rear;
    Node front;
    int N = 0; //size

    @Override
    public boolean isEmpty(){
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public void addFirst(E element) {
        Node node = new Node(element);
        node.next = front;
        //case-1 add item to Empty Deque
        // front and rear link to the same node
        if (front == null){
            rear = node;
        }
        //case-2 Deque already has some items
        //link front to this item
        else{
            front.prev = node;
        }
        front = node;
        N++;
    }

    @Override
    public void addLast(E element) {
        Node node = new Node(element);
        node.prev = rear;
        //case-1 add item to Empty Deque
        // front and rear link to the same node
        if (rear == null){
            front = node;
        }
        //case-2 Deque already has some items
        //link rear to this item
        else{
            rear.next = node;
        }
        rear = node;
        N++;
    }

    @Override
    public E getFirst() throws EmptyDequeException {
        if(front == null){
            throw new EmptyDequeException("Deque is empty");
        }
        return front.element;
    }

    @Override
    public E getLast() throws EmptyDequeException {
        if(rear == null){
            throw new EmptyDequeException("Deque is empty");
        }
        return rear.element;
    }

    @Override
    public E removeFirst() throws EmptyDequeException {
        if(isEmpty()){
            throw new EmptyDequeException("Deque is empty");
        }
        Node node = front;

        front = front.next;
        //case1 - Deque only has one item
        //after removing, front and rear link to null
        if (front == null){
            rear = null;
        }
        //case2 - Deque only has many items
        //after removing, old front has set to null, new front move to next position.
        //The position of rear remains unchanged.
        else {
            front.prev = null;
        }
        N--;
        return node.element;
    }

    @Override
    public E removeLast() throws EmptyDequeException {
        if(isEmpty()){
            throw new EmptyDequeException("Deque is empty");
        }
        Node node = rear;
        rear = rear.prev;
        //case1 - Deque only has one item
        //after removing, front and rear link to null
        if (rear == null){
            front = null;
        }
        //case2 - Deque only has many items
        //after removing, old rear has set to null, new rear move backward last position.
        //The position of front remains unchanged.
        else{
            rear.next = null;
        }
        N--;
        return node.element;
    }

    @Override
    public String toString() {
        String output = "";
        Node node = front;
        while (node != null) {
            output += node.element.toString() + "----->";
            node = node.next;
        }
        return output;
    }
}
