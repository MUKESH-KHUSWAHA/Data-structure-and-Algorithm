import java.util.Stack;

public class palindromelinkedlist{
    public class node{
        char data;
        node next;
        public node(char data){
            this.data=data;
            this.next=null;
        }
    }
    public static node head;
    public static node tail;
    public static int size;
    public void addlast(char data){
        node newnode=new node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;


    }
    public node findmid(node head){
        node fast=head;
        node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;

    }
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
    // using stack
    public static boolean is_palindrome(node head){
        node  slow=head;
        boolean ispalin=true;
        Stack<Character>s=new Stack<>();
        while(slow!=null){
            s.push(slow.data);
            slow=slow.next;
        }
        while(head!=null){
            int i=s.pop();
            if(head.data==i){
                ispalin= true;
            }
            else{
                ispalin= false;
                break;
            }
            head=head.next;
        }
        return ispalin;
    }
    public static void main(String[] args) {
        palindromelinkedlist ll=new palindromelinkedlist();
        ll.addlast('A');
        ll.addlast('B');
        ll.addlast('C');
        ll.addlast('B');
        ll.addlast('A');
        // System.out.println(ll.checkpalindrome());
        System.out.println(is_palindrome(head));



        
    }
}
