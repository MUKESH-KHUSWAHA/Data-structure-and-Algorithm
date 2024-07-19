public class index1{
    public static void printarr(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergesort(int si,int ei,int arr[]){
        // base case
        while(si>=ei){
            return;
        }
        // kaam
        int mid=si+(ei-si)/2;
        // left part
        mergesort(si, mid, arr);
        // right part
        mergesort(mid+1, ei, arr);
        // merge
        merge(si, ei, mid, arr);

    }
    public static void merge(int si,int ei,int mid,int arr[]){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[j];
                j++;
            }
            else{
                temp[k]=arr[i];
                i++;
            }
            k++;        
        }
        // for leftover left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        // for leftover right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy to original arr
        for( k=0,i=si;k<temp.length; k++,i++){
            arr[i]=temp[k];

        }
    }
    public static void main(String[] args) {
        int arr[]={6,3,8,9,4,5};
        mergesort(0, arr.length-1, arr);
        printarr(arr);
        
    }
}