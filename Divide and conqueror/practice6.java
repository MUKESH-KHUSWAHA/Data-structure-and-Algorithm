public class practice6 {
    public static void inversion(int arr[],int si,int ei){
        int count=0;
        for(int i=0;i<=arr.length-1;i++){
         
            for (int j=1;j<arr.length-i;j++){
                if (arr[i]>arr[j]){
                    count ++;

                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
        inversion(arr, 0, arr.length-1);
    }
}
