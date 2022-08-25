package LinkedList;

public class MyList {
    public static void main(String[] args) {
        List list = new List();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addIndex(40,1);
        list.print();

        System.out.println();
        System.out.println(list.size());
        System.out.println();

        System.out.println("finish");
    }
}

