package Stack;

public class StackMain {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack(3);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.size());

        myStack.remove(1);
        myStack.display();

    }
}