package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.removeAt(10);
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.print();
    }
}

