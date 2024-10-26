import java.util.*;
public class sum_2_array {
    public static void sum_of_2num(int arr[],int target){
        HashMap<Integer,Integer>map=new HashMap<>();
        int idx1;
        int idx2;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i], i);
            }
            else{
                idx1=map.get(target-arr[i]);
                idx2=i;
                System.out.println("indexes of element whose sum  is  "+target+" are "+"("+idx1+","+idx2+")");

                break;
            
            }

        }
    }
    public static void main(String[] args) {
        int array[]={2,7,11,15};
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        int target=9;
        sum_of_2num(array, target);
    }
}
