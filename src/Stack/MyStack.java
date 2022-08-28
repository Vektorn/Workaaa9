package Stack;

public class MyStack<T> {
    private int capacity;
    private T[] nums;
    private int top;

    public MyStack(int size){
        this.nums= (T[]) new Object[size];
        this.capacity=size;
        this.top=-1;
    }
    public void push (T data) {
        if (capacity == nums.length) {
            T[] newNums = (T[]) new Object[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                newNums[i] = nums[i];
            }
            nums = newNums;
        }
            nums[++top] = data;
        }
    public void remove(int index) {
        if (index>=capacity)
            return;
        nums[index]=null;
        for (int i = index; i <nums.length-1 ; i++) {
            nums[i]=nums[i+1];
        }
        nums[nums.length-1]=null;
        capacity--;
    }
    public T pop(){
        if (isEmpty())        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return nums[top--];
    }
     public T peek(){
         if (!isEmpty()) {
             return nums[top];
         }
         else {
             System.exit(-1);
         }
        return null;
     }
    public void clear(){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = null;
        }
        capacity=0;
        for (T i : nums) {
            System.out.println(i);
        }
    }
     public void display(){
        for (T elem: nums){
            System.out.print(elem + " ");
        }
    }
    public int size() {
        return top + 1;
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}

