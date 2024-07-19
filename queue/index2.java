public class index2 {
    // circular queue
    static class queue{
        static int arr[];
        static int size;
        static int front =-1;
        static int rear=-1;
        queue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        public static boolean isEmpty(){
            return rear==-1&&front==-1;
        }
        public static boolean is_full(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(is_full()){
                System.out.println("queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;

        }
        public static int remove(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;   
            }
            int result=arr[front];
            front=(front+1)%size;
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return result;
        }
        public static int peek(){
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;   
            }
            return arr[front];

        }

    }
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        queue q=new queue(5);
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
