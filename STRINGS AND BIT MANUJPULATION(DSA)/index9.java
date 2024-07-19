import java.util.Arrays;

public class index9 {
    public static void main(String[] args) {
        String str1="race";
        String str2="care";
        anagram(str1, str2);
        
    }
    public static void anagram(String str1,String str2){
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        if (str1.length()==str2.length()) {
            char string1[]=str1.toCharArray();
            char string2[]=str2.toCharArray();
            Arrays.sort(string1);
            Arrays.sort(string2);
            boolean result=Arrays.equals(string1,string2);
            if (result) {
                System.out.println("the strings are anagram of each other");
                
            }
            else{
                System.out.println("the strings are not anagram of each other");
            }


            
        }
    }
    
}
