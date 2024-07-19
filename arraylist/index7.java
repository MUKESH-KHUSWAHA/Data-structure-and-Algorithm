import java.util.*;
public class index7{
    public static int storewater(ArrayList<Integer>Height){
        int maxwater=0;
        int lp=0;
        int rp=Height.size()-1;
        while(lp<rp){
            int ht=Math.min(Height.get(lp),Height.get(rp));
            int width =rp-lp;
            int currwater=ht*width;
            maxwater=Math.max(maxwater, currwater);
            if(lp<rp){
                lp++;
            }else{
                rp--;

            }
        

        }
        
        
        return maxwater;    
    }

    public static void main(String[] args) {
        ArrayList<Integer>Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        System.out.println(storewater(Height));
    }
}


