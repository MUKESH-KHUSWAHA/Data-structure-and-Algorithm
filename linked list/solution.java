public class solution {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
            
        }
    }
    public  node getintersection(node head1,node head2){
        while(head2 !=null){
            node temp=head1;
            while(temp!=null){
                if(temp == head2){
                    return head2;
                }
                temp=temp.next;
            }
            head2=head2.next;
        }
        return null;
    }
    public static void main(String[] args) {
        solution sl=new solution();
        node head2,head1;

        head1=new node(9);
        head2=new node(1);

        node newnode=new node(2);
        head2.next=newnode;

        newnode=new node(4);
        head2.next.next=newnode;

        newnode=new node(2);
        head1.next=newnode;
        head2.next.next.next=newnode;

        newnode=new node(30);
        head1.next.next=newnode;

        head1.next.next.next=null;

        node intersectionpoint=sl.getintersection(head1, head2);
        if (intersectionpoint==null) {
            System.out.println("no intersection point");
            
        }
        else{
            System.out.println("intersection point "+intersectionpoint.data);
        }
       

       
    }
}
