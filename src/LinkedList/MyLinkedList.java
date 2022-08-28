package LinkedList;

public class MyLinkedList<T> {
    private LinkedNode<T> head;
    private LinkedNode<T> tail;

    public MyLinkedList(){
        tail=null;
        head=null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void add(T data){
        LinkedNode<T> temp = new LinkedNode<T>(data);
        if (isEmpty())
            head=temp;
        else
            tail.next=temp;
        temp.prev =tail;
        tail=temp;
    }

    public void removeFirst(){
        if (head.next==null){
            tail=null;
        }
        else
            head.next.prev=null;
        head=head.next;
    }
    public void removeLast(){
        if (head.next==null)
            head=null;
        else
            tail.prev.next=null;
        tail=tail.prev;
    }
    public void removeAt(int index){
        LinkedNode<T> cur = head;
        for (int i = 0; i < index ; i++) {
            cur = cur.next;
            if (cur == null)
                return;
        }
        if (cur == head)
            removeFirst();
        else
            cur.prev.next=cur.next;

        if (cur==tail)
            removeLast();
        else
            cur.next.prev=cur.prev;
    }
    public T get(int index){
        LinkedNode<T> temp = head;
        int cc = 0;
        for (int i = 0; i < index ; i++) {
            if (temp == null)
                return null;

            temp = temp.next;
        }
        return temp.data;
    }
    public int size() {
        LinkedNode<T> cur = head;
        int count =0;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    public void clear(){
        head = null;
    }

    public void print(){
        LinkedNode<T> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
