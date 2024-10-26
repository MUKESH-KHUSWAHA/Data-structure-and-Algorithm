import java.util.*;
public class Majority_element {
    public static void main(String[] args) {
        int N[]={1,3,2,5,1,3,1,5,1};
        int n=N.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<N.length;i++){
            int num=N[i];
            // if(map.containsKey(num)){
            //     map.put(num, map.get(num)+1);
            // }
            // else{
            //     map.put(num, 1);
            // }

            map.put(num, map.getOrDefault(num, 0)+1);
        }

        // Set<Integer>KeySet=map.keySet();
            for (Integer keys : map.keySet()) {
                if(map.get(keys)>n/3){
                    System.out.println(keys);
                }
                
            }
        

    }
}
