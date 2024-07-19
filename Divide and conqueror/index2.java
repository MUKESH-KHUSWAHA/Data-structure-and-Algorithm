public class index2 {
    public static void printarr(int arr[]){
        for (int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){
        if(si>ei){
            return;
        }
        int pdx=partion(arr,si,ei);
        quicksort(arr, si, pdx-1);
        quicksort(arr, pdx+1, ei);


    }
    public static int partion(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;
        for(int j=si;j<ei;j++){
            if(pivot>=arr[j]){
                i++;
                // swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
            
        }  
        i++;
                // swap
                int temp=pivot;
                arr[ei]=arr[i];
                arr[i]=temp;
                return i;
    }
    public static void main(String[] args) {
        int arr[]={6,7,5,4,9,3};
        quicksort(arr, 0, arr.length-1);
        printarr(arr);
        
    }
}
