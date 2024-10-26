import java.util.*;
public class priority_queue{
    public static void main(String[] args) {
        // PriorityQueue<Integer>pq=new PriorityQueue<>();
        PriorityQueue<Integer>pq=new PriorityQueue<>(Comparator.reverseOrder());//FOR REVERSE ORDER
        
        pq.add(1);
        pq.add(4);
        pq.add(2);
        while(!pq.isEmpty()){
            System.out.println(pq.peek());// it will print in ascending order
            pq.remove();
        }
        
    }

}