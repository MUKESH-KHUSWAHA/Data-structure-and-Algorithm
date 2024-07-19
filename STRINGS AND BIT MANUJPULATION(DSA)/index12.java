import java.util.*;
@SuppressWarnings("unused")
public class index12 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number and index whose ith bit you want respectively");
    int n=sc.nextInt();
    int i=sc.nextInt();
   System.out.println( updateithbit(n, i,0));
    }
      // get ith bit
    public static int getithbit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }
        else{
            return 1;
        }

    }
    // set ith bit
    public static int setithbit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;
    }
    // clear ith bit
    public static int clearithbit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;

    }
    // update ith bit
    public static int updateithbit(int n,int i,int newbit){
        if (newbit==0) {
            return clearithbit(n, i);
            
        }
        else if(newbit==1){
            return setithbit(n, i);
        }
        return 0;
    }
}
