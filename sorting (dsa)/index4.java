import java.util.Arrays;
import java.util.Collections;
public class index4 {
    public static void main(String[] args) {
        Integer array[]={6,7,8,9,4};
        // Arrays.sort(array);
        Arrays.sort(array,Collections.reverseOrder());
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        
    }
}
