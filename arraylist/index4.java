import java.util.ArrayList;
import java.util.Collections;
public class index4 {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(9);
        l1.add(10);
        l1.add(3);
        l1.add(8);
        l1.add(7);
        Collections.sort(l1);
        System.out.println(l1);
        Collections.sort(l1,Collections.reverseOrder());
    
        System.out.println(l1);


        
    }
    
}
