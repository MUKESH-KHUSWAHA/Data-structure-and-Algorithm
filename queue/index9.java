import java.util.*;

public class index9 {
    public static void main(String[] args) {
        Queue<Integer> Q1=new LinkedList<>();
        for(int i=1;i<=10;i++){
            Q1.add(i);
        }
        Stack<Integer>s1=new Stack<>();
        while(!Q1.isEmpty()){
            s1.push(Q1.remove());
        }
        while(!s1.isEmpty()){
            Q1.add(s1.pop());
        }
        while(!Q1.isEmpty()){
            System.out.println(Q1.peek());
            Q1.remove();
        }
    

        
    }
}
