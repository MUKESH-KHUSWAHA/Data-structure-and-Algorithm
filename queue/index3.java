public class index3 {
    static class node {
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }  
    }
    static class  queue {
        static node head=null;
        static node tail=null;
        public static boolean isEmpty(){
            return head==null&&tail==null;
        }
        public static void add(int data){
            node newnode=new node(data);
            if(head==null){
                head=tail=newnode;
                return ;
            }
            tail.next=newnode;
            tail=newnode;
        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1; 
            }
            int front=head.data;
            if(tail==head){
                tail=head=null;
            }
            head=head.next;
            return front;

        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1; 
            }
            return head.data;

        }

    
        
    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        
        queue q=new queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.isEmpty());
        System.out.println(q.remove());
        System.out.println(q.peek());
    }
}
