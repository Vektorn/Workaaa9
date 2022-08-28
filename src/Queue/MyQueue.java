package Queue;

public class MyQueue<T> {
    private T[] arr;
    private int front;
    private int rear;
    private int count;

    public MyQueue(int size){
        this.arr = (T[]) new Object[size];
        this.front = 0;
        this.rear = -1;
        this.count = 0;
    }
    public T poll() {
            T x = arr[front];
            System.out.println("Removing " + x);
            front = (front + 1) % arr.length;
            count--;
            return x;
}
    public void add(T item){
        if (count == arr.length) {
            T[] newArr = (T[]) new Object[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        System.out.println("Inserting " + item);
        rear = (rear + 1) % arr.length;
        arr[rear] = item;
        count++;
    }
    public void remove(int index) {
            if (index >= count)
                return;
            arr[index] = null;
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = null;
            rear--;
            count--;
        }
    public T peek(){
        if (isEmpty())        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }
    public void clear(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = null;
        }
        count = 0;
        for (T i : arr) {
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
        return (size() == arr.length);
    }
}
