import java.util.*;
public class max_subarray_with_sum_0 {
    public static int max_len(int arr[]){
        int sum=0;
        int max_len=0;
        HashMap<Integer,Integer>map=new HashMap<>();

        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(sum==0){
                max_len=j+1;
            }
            if(map.containsKey(sum)){
                max_len=Math.max(max_len, j-map.get(sum));
            }
            else{
                map.put(sum, j);
            }
        }
        return max_len;


    }
    // brute force
    public static int maxLen(int[] arr) {
        int max_len = 0;
        
        // Pick starting point
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            
            // Try different end points for subarrays starting with i
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                // If sum becomes 0, update max_len
                if (sum == 0) {
                    max_len = Math.max(max_len, j - i + 1);
                }
            }
        }

        return max_len;


    }
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10};
        int len=max_len(arr);
        System.out.println("maximum length of array whose sum is 0 => "+len);
        int len2=maxLen(arr);
        System.out.println("maximum length of array whose sum is 0 => "+len2);

    }
}
