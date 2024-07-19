import java.util.*;

public class index8 {
    @SuppressWarnings("unused")
    public static void interleave(Queue<Integer>Q2){
        Queue<Integer> first_half=new LinkedList<>();
        Queue<Integer> Ans =new LinkedList<>();
        for(int i=0;i<5;i++){
            first_half.add(Q2.remove());
        }
        for(int i=0;i<5;i++){
            Q2.add(first_half.remove());
            Q2.add(Q2.remove());
        }
        // while(!Ans.isEmpty()){
        //     System.out.println(Ans.peek());
        //     Ans.remove();
        // }


    }
    public static void main(String[] args) {
        Queue<Integer> Q2=new LinkedList<>();
        for(int i=1;i<=10;i++){
            Q2.add(i);
        }
    
        interleave(Q2);
        while (!Q2.isEmpty()){
            System.out.println( Q2.peek());
            Q2.remove(); 
        }
        


    }
}
