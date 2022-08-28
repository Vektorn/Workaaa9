package LinkedList;

public class LinkedListMain {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.removeAt(1);
        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list.get(2));
        list.print();
    }
}

