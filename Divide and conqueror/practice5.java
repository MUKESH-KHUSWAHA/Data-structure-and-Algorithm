public class practice5 {
    public static int countinrange(int arr[],int nums,int si,int ei){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==nums){
                count++;

            }
        }
        return count;
    }
    public static int majorityelement(int arr[],int si,int ei){
        if(si>=ei){
            return arr[si];
        }
        int mid=si+(ei-si)/2;
        int left=majorityelement(arr, si, mid);
        int right=majorityelement(arr, mid+1, ei);
        if(left==right){
            return left;
        }
        int leftcount=countinrange(arr,left,si,ei);
        int rightcount=countinrange(arr,right,si,ei);
        return leftcount>rightcount?left:right;

    }
    public static void main(String[] args) {
        int arr[]={2,2,1,2,1,2,1};
        System.out.println(majorityelement(arr, 0, arr.length-1));
    }
}
