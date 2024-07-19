public class practice7 {
    public static void printarr(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int mergesort(int si,int ei,int arr[]){
        int invcount=0;
        // kaam
        if(ei>si){
            int mid=(si+ei)/2;
            // left part
        invcount=mergesort(si, mid, arr);
        // right part
        invcount+=mergesort(mid+1, ei, arr);
        // merge
        invcount+=merge(si, ei, mid+1, arr);

        }
        return invcount;
        
        
       

    }
    public static int merge(int si,int ei,int mid,int arr[]){
        int temp[]=new int[ei-si+1];
        int i=si;
        int j=mid;
        int k=0;
        int invcount=0;
        while(i<mid && j<=ei){
            if(arr[i]<=arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
                invcount += mid-i;
            }
            k++;        
        }
        // for leftover left part
        while(i<mid){
            temp[k++]=arr[i++];
        }
        // for leftover right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        // copy to original arr
        for( k=0,i=si;i<=ei; k++,i++){
            arr[i]=temp[k];

        }
        return invcount;
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3,5};
    System.out.println(mergesort(0, arr.length-1, arr));
    printarr(arr);
        
    }
    
}
