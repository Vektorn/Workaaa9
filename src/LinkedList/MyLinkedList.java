package LinkedList;

public class MyLinkedList {
    public int data;
    public MyLinkedList next;
    public  MyLinkedList prev;

    public MyLinkedList(int data){
        this.data=data;
    }
























//
//    private Node head;
//
//    public MyLinkedList(){
//        head=null;
//    }
//    public class Node{
//        public int data;
//        public Node next;
//
//        public Node(int data){
//            this.data = data;
//            next= null;
//        }
//    }
//    public void add(int data){
//        Node newNode = new Node(data);
//        Node currentNode = head;
//
//        if (head == null) {
//            head=newNode;
//        }
//        else {
//            while (currentNode.next !=null){
//                currentNode=currentNode.next;
//            }
//            currentNode =newNode;
//        }
//    }
//
//    public void remove(int data){
//         Node currentNode = head;
//         Node previousNode = null;
//
//         while (currentNode.next !=null){
//             if (currentNode.data==data){
//                 if (currentNode == head){
//                     head=currentNode.next;
//                 }else {
//                     previousNode.next = currentNode.next;
//                 }
//             }
//         }
//         previousNode = currentNode;
//         currentNode = currentNode.next;
//    }
//    public void display(){
//        Node currentNode = head;
//        if (head != null){
//            System.out.println(head.data);
//        }
//        while (currentNode.next != null){
//            currentNode = currentNode.next;
//            System.out.println(currentNode.data);
//        }
//    }
}

