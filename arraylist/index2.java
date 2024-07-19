import java.util.ArrayList;
@SuppressWarnings("unused")
public class index2 {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(9);
        l1.add(10);
        l1.add(3);
        l1.add(8);
        l1.add(7);
        int idx1=2;
        int idx2=0;

        swap(l1,idx1,idx2);
    }
    public static void swap(ArrayList<Integer>l1,int idx1,int idx2){
        int temp=l1.get(idx1);
        l1.set(idx1,l1.get(idx2));
        l1.set(idx2,temp);
        System.out.println(l1);
    }
    
}
