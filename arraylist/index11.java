import java.util.*;
public class index11 {
    public static void main(String[] args) {
        ArrayList<Integer>l1=new ArrayList<>();
        l1.add(1);
        l1.add(3);
        l1.add(4);
        l1.add(4);
        l1.add(5);
        System.out.println(lonely(l1));
    }
    public static ArrayList<Integer> lonely(ArrayList<Integer>nums){
        Collections.sort(nums);
        ArrayList<Integer>list=new ArrayList<Integer>();
        for(int i=1;i<nums.size()-1;i++){
            if(nums.get(i-1)+1<nums.get(i)&&nums.get(i)+1<nums.get(i+1)){
                list.add(nums.get(i));
            }
    }
        if(nums.size()==1){
            list.add(nums.get(0));
        }
    
        if(nums.size()>1){
            if(nums.get(0)+1<nums.get(1)){
                list.add(nums.get(0));
            }
            if(nums.get(nums.size()-2)<nums.get(nums.size()-1)){
                list.add(nums.get(nums.size()-1));

        }

    }
    
    return list;
}
}
    
        
