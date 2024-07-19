import java.util.LinkedList;
@SuppressWarnings("unused")
public class linkedlist5 {
    public class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addfirst(int data){
        // create a new node
       
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        newnode.next=head;
        head=newnode;
    }
    public static void main(String[] args) {
        LinkedList<Integer>ll=new LinkedList<>();
        ll.addLast(1);
        ll.addFirst(2);
        System.out.println(ll);


        
    }
}
