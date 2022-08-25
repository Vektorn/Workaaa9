package LinkedList;

public class MyList {
    public static void main(String[] args) {
        List list = new List();

        list.add(10);
        list.add(20);
        list.add(30);
        list.print();

        System.out.println();

        list.print();
        System.out.println(list.get(10));
    }
}

