public class linkedlist2 {
    public static class node{
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
        // create new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        // new node next=head
        newnode.next=head;
        // head= new node
        head=newnode;
        
    }
    public void addlast(int data){
        // create a new node
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
            return;
        }
        // new node next=tail
        tail.next=newnode;
        
        // tail=new node
        tail=newnode;
    }
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void add(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        node newnode=new node(data);
        size++;
        node temp=head;
        int i=0;
        
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
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
        node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;

        }
        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public int search(int data){
        node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==data){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;


    }
    public int helper(node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;

        }
        return idx+1;
    }
    public int recsearch(int key){

        return helper(head,key);

    }
    
    public void zigzag(){
        node fast=head;
        node slow=head;
        while (fast!=null&&fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;   
       }
        node mid=slow;
        node prev=null;
        node curr=mid.next;
        mid.next=null;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node RH=prev;
        
        node LH=head;
        node nextl,nextr;
        while(LH!=null&&RH!=null){
            nextl=LH.next;
            LH.next=RH;
            nextr=RH.next;
            RH.next=nextl;
            LH=nextl;
            RH=nextr;
        }


    }




        
    
    public static void main(String[] args) {

    linkedlist2 ll=new linkedlist2();
    ll.addlast(1);
    ll.addlast(2);
    ll.addlast(3);
    ll.addlast(4);
    ll.addlast(5);
    ll.print();
    ll.zigzag();
    ll.print();
  
    
    
    
    
        
    }
}
