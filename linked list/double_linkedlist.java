public class double_linkedlist {
    public static class node{
        int data;
        node next;
        node prev;
        public node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;

    public void addFirst(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;



    }
    public void addlast(int data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        newnode.prev=tail;
        tail.next=newnode;
        
    }
    public int removefirst(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        head.prev=null;
        return val;
    }
    public int removelast(){
        if(size==0){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        node prevous=head;
        for(int i=0;i<size-2;i++){
            prevous=prevous.next;

        }
        int val=prevous.next.data;
        prevous.next=null;
        tail.prev=null;
        tail=prevous;
        size--;
        return val;

        
    }



    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-> <-");
            temp=temp.next;

        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        double_linkedlist dll=new double_linkedlist();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(4);
        dll.addFirst(6);
        dll.addlast(9);
        dll.removefirst();
        dll.removelast();
        dll.print();


    }
}