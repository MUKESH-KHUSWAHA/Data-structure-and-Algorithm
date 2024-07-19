public class linkedlist4 {
    @SuppressWarnings("unused")
    public  static class node{
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
    public void addlast(int data){
        // create a new node
       
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    
    @SuppressWarnings("unused")
    public void print(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
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
        if(size==1){
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
        if(size==1){
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
    public void rev(){
        node prev=null;
        node curr=head;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    }
    public void deletefromend(int n){
        // calculate size
        int sz=0;
        node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(n==sz){
            head=head.next;
            return;

        }
        int i=1;
        int itofind=size-n;
        node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;
    }
    public node findmid(node head){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    // palindrome
    
    public boolean checkpalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        node midnode=findmid(head);
        node prev=null;
        node curr=midnode;
        node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        node right=prev;
        node left =head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;

        }
        return true;
    }
    public static boolean iscycle(){
        node slow=head;
        node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
                
            }


        }
        return false;
    }
    public static void removecycle(){
        // detect cycle
        node slow=head;
        node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;   
            }
        }
        if (cycle=false){
            return;
        }
        slow=head;
        node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        prev.next=null;



        
    }


    // private node getmid(node head){
    //     node slow=head;
    //     node fast=head.next;
    //     while (fast!=null&&fast.next!=null) {
    //         slow=slow.next;
    //         fast=fast.next.next;   
    //     }
    //     return slow;
    // }
    // private node merge(node head1,node head2){
    //     node mergedll=new node(-1);
    //     node temp=mergedll;
    //     while(head1!=null&&head2!=null){
    //         if(head1.data<=head2.data){
    //             temp.next=head1;
    //             head1=head1.next;
    //             temp=temp.next;


    //         }
    //         else{
    //             temp.next=head2;
    //             head2=head2.next;
    //             temp=temp.next;



    //         }

    //     }
    //     while(head1.next!=null){
    //         temp.next=head1;
    //         head1=head1.next;
    //         temp=temp.next;
    //     }
    //     while (head2.next!=null) {
    //         temp.next=head2;
    //         head2=head2.next;
    //         temp=temp.next;
            
            
    //     }
    //     return mergedll.next;
    // }
    // public node mergesort(node head){
    //     // find mid
    //     node mid=getmid(head);
    //     // divide into two parts
    //     node righthead=mid.next;
    //     mid.next=null;
    //     node leftpart=mergesort(head);
    //     node rightpart =mergesort(righthead);
    //     // merge the list
    //     return merge(leftpart,rightpart);


    // }

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
        // head=new node(1);
        // node temp=new node(2);
        
        // head.next=temp;
        // head.next.next=new node(3);
        // head.next.next.next=temp;
        // System.out.println(iscycle());
        // removecycle();
        // System.out.println(iscycle());



        linkedlist4 ll=new linkedlist4();
        ll.addfirst(8);
        ll.addfirst(4);
        ll.addfirst(1);
        ll.addfirst(9);
        ll.addfirst(3);
        ll.addfirst(6);
        ll.print();
        ll.zigzag();
        ll.print();





    
        // ll.addlast(1);
        // ll.addlast(2);
        // ll.addlast(1);
    

        // ll.print();
        // System.out.println(ll.removefirst());
        // System.out.println(ll.removelast());
        // System.out.println(ll.search(1));
        
        // ll.print();
        // ll.rev();
        // ll.print();
        // ll.deletefromend(3);
    
        
        // System.out.println(ll.checkpalindrome());
    

        
    }



    
}
