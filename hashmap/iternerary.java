import java.util.*;
public class iternerary {
    public static String start(HashMap<String,String >tickets){
        HashMap<String,String>revmap=new HashMap<>();
        for (String keys : tickets.keySet()) {
            revmap.put(tickets.get(keys), keys);
            
        }
        for (String keys : tickets.keySet()) {
            if(!revmap.containsKey(keys)){
                return keys;
            }
            
        }
        return null;

    }

    public static void main(String[] args) {
        HashMap<String,String>tickets=new HashMap<>();
        tickets.put("chennai", "bengaluru");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");
        String start=start(tickets);
        System.out.print(start);
        for (String keys: tickets.keySet()) {{
            System.out.print("-->"+tickets.get(start));
            start=tickets.get(start);


        }
            
        }


        
    }
}