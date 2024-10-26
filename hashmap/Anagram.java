import java.util.*;
public class Anagram {
    public static boolean isAnagram(String s,String r){
        if(s.length()!=r.length()){
            return false;
        }
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<r.length();i++){
            char ch=r.charAt(i);
            if(map.get(ch)!=null){
                if(map.get(ch)==1){
                    map.remove(ch);
                }
                else{
                    map.put(ch, map.get(ch)-1);
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();

    }
    public static void main(String[] args) {
        String s="RACE";
        String r="CARE";
        System.out.println(isAnagram(s, r));
    }
}
