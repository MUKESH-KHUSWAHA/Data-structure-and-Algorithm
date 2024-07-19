public class stackb {
    // by using linked list
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;

        }
    }
    static class stack{
        static node head=null;

        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            node newnode=new node(data);
            if(isEmpty()){
                head=newnode;
            }
            else{
                newnode.next=head;
                head=newnode;
            }

        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            int top=head.data;
            return top;

        }
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        stack s=new stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        
        }
    }
}

