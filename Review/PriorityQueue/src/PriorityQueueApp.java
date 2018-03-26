import java.util.PriorityQueue;

public class PriorityQueueApp {

    public static void main(String[] args){
        PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>(3, new ComparetoByNumber());
        Student[] student={new Student(3,"wangwu"),new Student(2,"lisi"),
                new Student(5,"xiaowang"),new Student(8,"lihua")};

        for (Student s: student){
            priorityQueue.offer(s); // use offer() method to add elements to the PriorityQueue
        }

        System.out.println("size: " + priorityQueue.size());
        System.out.println("peek: " + priorityQueue.peek());
        System.out.println("poll" + priorityQueue.poll());
        System.out.println("size" + priorityQueue.size());

        while(!priorityQueue.isEmpty()){
            System.out.print(priorityQueue.poll() + " ");
        }
        System.out.println("    the end");
    }

}