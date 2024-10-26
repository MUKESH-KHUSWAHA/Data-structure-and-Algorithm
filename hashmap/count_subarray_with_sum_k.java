import java.util.*;
public class count_subarray_with_sum_k {

    public static int count(int arr[],int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
        
        }
        return count;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int k=3;
        int count=count(arr, k);
        System.out.println(count);
        
    }
}
