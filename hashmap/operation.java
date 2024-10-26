import java.util.*;
public class operation{
    public  static void main(String[] args){
        // create
        HashMap<String,Integer> hm= new HashMap<>();
        // insert
        hm.put("India", 100);
        hm.put("Iran", 20);
        hm.put("China", 30);
        System.out.println(hm);

        // get
        int x=hm.get("India");
        System.out.println(x);
        System.out.println(hm.get("America"));

        // conatainsKey
        System.out.println(hm.containsKey("Iran"));

        // remove
        hm.remove("China");
        System.out.println(hm);

        // size
        System.out.println(hm.size());
        
        // isEmpty
        System.out.println(hm.isEmpty());

        // clear
        hm.clear();
        System.out.println(hm);



        

    }
}