import java.util.*;
public class stacka{
    // creating stack using arraylist
    static class stack1{
        static ArrayList<Integer> list=new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);


        }

    }

    
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
    
        stack1 s=new stack1();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();

        }

        
    }

}