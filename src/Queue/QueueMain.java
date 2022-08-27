package Queue;

public class QueueMain {
    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue(6);
        myQueue.add(18);
        myQueue.add(5);
        myQueue.add(19);
        myQueue.add(118);
        myQueue.add(15);

        myQueue.remove(1);
        myQueue.add(4141);
    }
}
