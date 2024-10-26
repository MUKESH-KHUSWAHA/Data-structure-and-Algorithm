import java.util.*;
public class iteration {
    public static void main(String[] args) {
        HashMap<String,Integer> hm= new HashMap<>();  
        int max=Integer.MIN_VALUE;
        hm.put("India", 100);
        hm.put("Iran", 20);
        hm.put("China", 200);
        hm.put("Africa", 15);   
        Set<String> keys=hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("Key ="+k+ " ,value ="+hm.get(k));
            
        }
        hm.entrySet();
    }
}
