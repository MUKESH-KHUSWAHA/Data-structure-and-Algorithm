import java.util.*;
public class iterationonset {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        // insert
        set.add("Delhi");
        set.add("Mumbai");
        set.add("Darjelling");
        set.add("Bengluru");
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        for (String cities : set) {
            System.out.println(cities);
            
        }

        
    }
}
