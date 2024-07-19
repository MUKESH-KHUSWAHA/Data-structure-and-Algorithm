import java.util.*;
public class index8 {
    public static void tar̥getsum(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            int sum=0;
            for(int j=i+1;j<list.size();j++){
                sum=list.get(i)+list.get(j);
                if(sum==target){
                    System.out.println("("+list.get(i)+","+list.get(j)+")");
                    // return;
                }
            }
        }
    }
    public static void tar̥getsum2(ArrayList<Integer>list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp!=rp){
            if((list.get(rp)+list.get(lp))==target){
                System.out.println("("+list.get(lp)+","+list.get(rp)+")");
            }
            if((list.get(rp)+list.get(lp))<target){
                lp++;
            }
            else{
                rp--;
            }
            }

        }
        
    
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2); 
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // tar̥getsum(list, 5);
        tar̥getsum2(list, 5);
    }
}
