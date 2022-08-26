package ArrayList;

public class MyArrayList<Tip> {
    private Tip[] list;
    private int size;
    private final int DEFAULT_CAPACITY = 10;

    public MyArrayList(int capacity){
        if(capacity <=0) {
            throw new IllegalArgumentException("Capacity <=0");
        }else {
            list = (Tip[]) new Object[capacity];
        }
    }
    public MyArrayList(){

        list = (Tip[]) new Object[DEFAULT_CAPACITY];
    }
    public void add (Tip item){
        if (size == list.length) {
            Tip[] newList = (Tip[]) new Object[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list=newList;
        }
        list[size++]=item;
    }
    public void add(int index, Tip item){
        if (size == list.length) {
            Tip[] newList = (Tip[]) new Object[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list=newList;
        }
        for (int i = size; i > index ; i--) {
            list[i] =list[i-1];}
        list[index]= item;
        size++;
    }
    public void remove(int index){
        if (size == list.length) {
            Tip[] newList = (Tip[]) new Object[list.length + 1];
            for (int i = 0; i < list.length; i++) {
                newList[i] = list[i];
            }
            list=newList;
        }
        for (int i = index; i < size; i++) {
            list[i]=list[i+1];
        }
    }
    public void display(){
        for (Tip elem: list){
            System.out.print(elem + " ");
        }
    }
    public Tip get(int index){

        return list[index];
    }
     public int size(){
        return (list.length);
     }
     public void clear(){
         for (int i = 0; i < size; i++) {
             list[i]=null;
         }
         size=0;
     }
}