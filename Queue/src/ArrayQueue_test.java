public class ArrayQueue_test {
    public static void main(String[] args) {
        Queue<String> queue = new ArrayQueue<String>();
        System.out.println("front" + "\t" + "rear" + "\t");

        queue.enqueue("Ireland");
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.enqueue("England");
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.enqueue("Wales");
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.enqueue("Scotland");
        System.out.println(queue);

        queue.dequeue();
        System.out.println(queue);

        queue.enqueue("France");
        System.out.println(queue);

        queue.enqueue("Germany");
        System.out.println(queue);

    }
}

