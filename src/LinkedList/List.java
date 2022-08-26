package LinkedList;

public class List {
    private MyLinkedList head;
    private MyLinkedList tail;


    public List(){
        tail=null;
        head=null;
    }
    public boolean isEmpty(){
        return head== null;
    }

    public void addFirst (int data){
        MyLinkedList temp = new MyLinkedList(data);
        if (isEmpty())
            tail=temp;
        else
            head.prev=temp;

        temp.next=head;
        head=temp;
    }
    public void addLast (int data){
        MyLinkedList temp = new MyLinkedList(data);
        if (isEmpty())
            head=temp;
        else
            tail.next=temp;

        temp.prev =tail;
        tail=temp;
    }

    public void addIndex(int data, int index){
        MyLinkedList cur = head;
        int t =0;

        while (cur!=null&& t!=index){
             cur=cur.next;
             t++;
        }
        MyLinkedList temp = new MyLinkedList(data);
        cur.prev.next=temp;
        temp.prev=cur.prev;
        cur.prev=temp;
        temp.next=cur;
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

    public void removeAt(int elem){
        MyLinkedList cur = head;

        while (cur.data !=elem){

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

    public int get(int key){
        MyLinkedList temp = head;
        int cc = 0;

        while (temp != null){
            if (temp.data == key)
                return cc;

            temp = temp.next;
            cc++;
        }
        return -1;
    }
    public int size() {
        MyLinkedList cur = head;
        int count =0;
       while (cur!=null){
           count++;
           cur=cur.next;
       }return count;
    }
//проблемс вроді

    public void clear(){
        MyLinkedList pre = head;
        int position = size();
        int coutn = 1;
        while (coutn <position-1){
            pre=pre.next;
            coutn++;
        }
        MyLinkedList cur = pre.next;
        pre.next=cur.next;
        cur.next=null;
    }

    public void print(){
        MyLinkedList temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
