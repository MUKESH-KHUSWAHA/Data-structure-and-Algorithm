import java.util.*;
public class index2 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();
        System.out.println(palindrome(name));  
    }
    public static boolean palindrome(String name){
        for(int i=0;i<name.length()/2;i++){
            if (name.charAt(i)!=name.charAt(name.length()-1-i)) {
                return false;
                
            }
        }
        return true;

        
    }
}
