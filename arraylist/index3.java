import java.util.ArrayList;
public class index3 {

    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(9);
        l1.add(10);
        l1.add(3);
        l1.add(8);
        l1.add(7);
        System.out.println(l1);

        int max=Integer.MIN_VALUE;
        for(int i=0;i<l1.size();i++){
            if(max<l1.get(i)){
                max=l1.get(i);
            }
        }
        System.out.println(max);




        // for(int i=l1.size()-1;i>=0;i--){
        //     System.out.println(l1.get(i)+" ");
        // }
        // System.out.println();


    }
}
