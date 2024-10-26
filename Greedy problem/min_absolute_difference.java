import java.util.Arrays;

public class min_absolute_difference {
    public static void main(String[] args) {
        int a[]={4,2,3};
        int b[]={3,2,1};
        Arrays.sort(a);
        Arrays.sort(b);
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=Math.abs(a[i]-b[i]);

        }
        System.out.println(sum);
    }
}
