package Queue;

public class MyQueue {
    private final int[] arr;
    private int front;
    private int rear;
    private final int capacity;
    private int count;

    public MyQueue(int size){
        this.arr = new int[size];
        this.capacity = size;
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }
    public int poll()
    {
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        int x = arr[front];
        System.out.println("Removing " + x);
        front = (front + 1) % capacity;
        count--;
        return x;
    }
    public void add(int item)
    {
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        count++;
    }
    public void remove(int index) {
       if (index>=count)
           return;
       arr[index]=0;
        for (int i = index; i <arr.length-1 ; i++) {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=0;
        rear--;
    }
    public int peek()    {
        if (isEmpty())        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }
    public void clear(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
    public int size() {
        return count;
    }
    public boolean isEmpty() {
        return (size() == 0);
    }
    public boolean isFull() {
        return (size() == capacity);
    }
}
