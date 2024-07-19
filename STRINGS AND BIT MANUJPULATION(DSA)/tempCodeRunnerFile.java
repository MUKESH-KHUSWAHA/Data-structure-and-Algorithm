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