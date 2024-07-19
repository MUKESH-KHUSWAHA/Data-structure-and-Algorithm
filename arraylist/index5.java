import java.util.*;
@SuppressWarnings("unused")
public class index5 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>>MainList=new ArrayList<>();
        ArrayList<Integer>L1=new ArrayList<>();
        ArrayList<Integer>L2=new ArrayList<>();
        ArrayList<Integer>L3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            L1.add(1*i);
            L2.add(2*i);
            L3.add(3*i);
        }
        MainList.add(L1);
        MainList.add(L2);
        MainList.add(L3);
        System.out.println(MainList);

        for(int i=0;i<MainList.size();i++){
            ArrayList<Integer>currlist=MainList.get(i);
            for(int j=0;j<currlist.size();j++){
                System.out.print(currlist.get(j)+" ");
            }
            System.out.println();
        }
        
    }
}
