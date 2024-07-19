import java.util.*;
public class index9 {
    public static void pairsum(ArrayList<Integer>l,int target){
        int bp=-1;
        int n=l.size();
        for(int i=0;i<l.size();i++){
            if(l.get(i)>l.get(i+1)){
                bp=i;
                break;
            }

        }
        int rp=bp;
        int lp=bp+1;
        while (lp!=rp) {
            if((l.get(rp)+l.get(lp))==target){
                System.out.println("("+l.get(lp)+","+l.get(rp)+")");
            }
            if((l.get(rp)+l.get(lp))<target){
                lp=(lp+1)%n;
            }
            else{
                rp=(n+rp-1)%n;
            }
            }
            
        }
    public static void main(String[] args) {
        ArrayList<Integer>l=new ArrayList<>();
        l.add(11);
        l.add(16);
        l.add(6);
        l.add(8);
        l.add(9);
        l.add(10);
        pairsum(l, 16);


        
    }
}
