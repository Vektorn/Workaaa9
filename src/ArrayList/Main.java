package ArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer>myArrayList =  new MyArrayList<>();

        myArrayList.add(1);
        myArrayList.add(3);
        myArrayList.add(5);
        myArrayList.add(6);
        myArrayList.add(7);
        myArrayList.add(8);
        myArrayList.add(15);
        myArrayList.add(16);
        myArrayList.add(17);
        myArrayList.add(18);
        myArrayList.add(28);
        myArrayList.add(18);
        myArrayList.add(28);

        myArrayList.delete(4);

        myArrayList.display();
    }
}
