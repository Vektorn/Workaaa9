package Queue;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue myQueue =new MyQueue(3);

        myQueue.add(9);
        myQueue.add(18);
        myQueue.add(5);

        myQueue.clear();

    }
}
