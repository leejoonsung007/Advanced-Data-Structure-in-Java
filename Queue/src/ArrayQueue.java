public class ArrayQueue<E> implements Queue<E> {
    private E[] Q;
    private int N = 1000;
    private int front = 0;
    private int rear = 0;

    //default constructor
    public ArrayQueue() {
        Q = (E[]) (new Object[N]);
    }

    //constructor
    public ArrayQueue(int capicity) {
        Q = (E[]) (new Object[capicity]);

    }

    @Override
    public boolean isEmpty() {
        return rear == front;
    }

    @Override
    public E front() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty");
        } else
            return Q[front];
    }

    @Override
    public int size() {
        if (isEmpty())
            return 0;
        else
            return (N + rear - front) % N;
    }


    @Override
    public void enqueue(E element) throws FullQueueException {
        if (size() == N - 1) {
            throw new FullQueueException("Queue is full");
        }
        Q[rear] = element;
        rear = (rear + 1) % N;

    }

    @Override
    public E dequeue() throws EmptyQueueException {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue is empty, cannot dequeue");
        } else {
            E temp = Q[front];
            Q[front] = null;
            front = (front + 1) % N;
            return temp;
        }
    }

    @Override
    public String toString() {
        String out = front + "\t\t" + rear + "\t";
        for (int i = 0; i < Q.length; i++) {
            out += "|" + (Q[i] != null ? Q[i] : "|");
        }
        return out;
    }

}