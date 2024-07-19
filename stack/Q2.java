import java.util.Stack;

public class Q2 {
    public static String reversestring(String str){
        Stack<Character> s=new Stack<>();
        int idx;
        for( idx=0;idx<str.length();idx++){
            s.push(str.charAt(idx));
        }
        StringBuilder sb=new StringBuilder("");
        while(!s.isEmpty()){
            char curr=s.pop();
            sb.append(curr);

        }
        return sb.toString();


    }
    public static void main(String[] args) {
        String str="hello world";
        String result=reversestring(str);
        System.out.println(result);
    }
}
