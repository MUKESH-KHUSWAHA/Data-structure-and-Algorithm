import java.util.ArrayList;
@SuppressWarnings("unused")
public class index1{
    public static void main(String[] args) {
        ArrayList<Integer>list1=new ArrayList<>();
        ArrayList<String>list2=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        // list1.add(3,10);
        // System.out.println(list1);
        // System.out.println(list1.get(2));
        // list1.remove(3);
        // System.out.println(list1);
        list1.set(3, 10);
        System.out.println(list1);
        System.out.println(list1.contains(10));
        System.out.println(list1.size());




    



    }
    
}