public class solution2 {
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
    public void delete_m_nodes(int n,int m,node head) {
        node temp=head,t;
        int count;

        while(temp !=null){
            for(count=1;temp!=null&&count<n;count++){
                temp=temp.next;
            }
           
            if(temp==null){
                return;
            }
            t=temp.next;
            for(count=1;count<n&&t!=null;count++){
                // node curr=t;
                t=t.next;
            }
            temp.next=t;
            temp=t;
        }
        
    }
    public void swapnodes(int x,int y){
        if(x==y){
            return;
        }
        node prevx,prevy,currx,curry;
        // for x
        prevx=null;
        currx=head;
        while(currx!=null&&currx.data !=x){
            prevx=currx;
            currx=currx.next;
        }

        // for y
        prevy=null;
        curry=head;
        while(curry!=null&&curry.data!=y){
            prevy=curry;
            curry=curry.next;
        }
        if(currx==null||curry==null){
            return;
        }
        if(prevx!=null){
            prevx.next=curry;
        }
        else{
            head=curry;
        }
        if(prevy!=null){
            prevy.next=currx;
        }
        else{
            head=currx;
        }
        node temp=currx.next;
        currx.next=curry.next;
        curry.next=temp;
        
    }

    public static void main(String[] args) {
        // select n node then delete m nodes

        solution2 sl=new solution2();
        sl.addlast(1);
        sl.addlast(2);  
        sl.addlast(3);  
        sl.addlast(4);
        sl.addlast(5); 
        sl.addlast(6); 
        sl.addlast(7);
        sl.addlast(8);
        sl.print();
        sl.swapnodes(2, 6);
        // sl.delete_m_nodes(2, 1, head);
        sl.print();
    }
}
