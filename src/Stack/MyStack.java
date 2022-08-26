package Stack;

public class MyStack {
    private int capacity;
    private int nums[];
    private int top;

    public MyStack(int size){
        this.nums= new int[size];
        this.capacity=size;
        this.top=-1;
    }
    public void push (int data){
        if (isFull())        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(-1);
        }
        nums[++top]=data;
    }
    public void remove(int indexx) {
        int[] newArr = null;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == indexx) {
                newArr = new int[nums.length-1];
                for (int index = 0; index < i; index++) {
                    newArr[index] = nums[index];
                }
                for (int j = i; j < nums.length-1; j++) {
                    newArr[j] = nums[j + 1];
                }
            }
        }
    }
    public int pop(){
        if (isEmpty())        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return nums[top--];
    }
     public int peek(){
         if (!isEmpty()) {
             return nums[top];
         }
         else {
             System.exit(-1);
         }
        return -1;
     }
    public void clear(){
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 0;
        }
        for (int i : nums) {
            System.out.println(i);
        }
    }
     public void display(){
        for (int elem: nums){
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

