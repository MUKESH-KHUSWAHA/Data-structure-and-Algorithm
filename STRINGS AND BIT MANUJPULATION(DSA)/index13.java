import java.util.*;
@SuppressWarnings("unused")
public class index13 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number and index whose ith bit you want respectively");
    int n=sc.nextInt();
    int i=sc.nextInt();
    int j=sc.nextInt();
//    System.out.println( clearbitsinrange(n, i, j));
//    powerof2ornot(n);
System.out.println(countsetbits(n));
    }
    public static int clearbits (int n,int i){
        int bitmask=(~0)<<i;
        return n&bitmask;
    }
    public static int clearbitsinrange(int n,int i,int j){
        int a=(~0)<<(j+1);
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static void powerof2ornot(int n){
        if ((n&n-1)==0) {
            System.out.println(n+"can be resolve in power of 2"); 
        }
        else{
            System.out.println(n+"can't be resolve in power of 2");
        }
    }
    public static int countsetbits(int n){
        int count=0;
        while(n>0){
            if ((n&1 )!=0) {
                count++;
                
            }
            n=n>>1;

        }
        return count;
    }
}
