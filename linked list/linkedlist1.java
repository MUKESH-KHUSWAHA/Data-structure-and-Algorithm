public class linkedlist1 {
    public static class node{
        int data;
        node next;
        public node (int data) {
            this.data=data;
            this.next=null;
        }
    } 
    public static  node head;
    public static node tail;

    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        linkedlist1 ll=new linkedlist1();
        ll.head=new node(1);
        ll.head.next=new node(1);
        
    }
}