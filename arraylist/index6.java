import java.util.*;
public class index6 {
    public static int storewater(ArrayList<Integer>Height){
        int maxwater=0;
        for(int i=0;i<Height.size();i++){
            for(int j=i+1;j<Height.size();j++){
                int ht=Math.min(Height.get(i),Height.get(j));
                int width =j-i;
                int currwater=ht*width;
                maxwater=Math.max(maxwater, currwater);
            }
        }
        return maxwater;    }

    public static void main(String[] args) {
        ArrayList<Integer>Height=new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);
        System.out.println(storewater(Height));
    }
}
