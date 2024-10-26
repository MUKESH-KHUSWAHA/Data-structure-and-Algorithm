import java.util.*;
public class Hashset {
    public static void main(String[] args) {
        HashSet<String>set=new HashSet<>();
        // insert
        set.add("hello");
        set.add("world");
        set.add("hi");
        set.add("how");
        set.add("hello");
        System.out.println(set);
        // contains
        set.remove("hello");
        System.out.println(set.contains("hello"));
        // size
        set.clear();
       System.out.println( set.size());

        


        
    }
}

