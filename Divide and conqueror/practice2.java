public class practice2 {
    public static void quicksort(int arr[],int si,int ei){
        while(si>=ei){
            return;
        }
        int pdx=partition(arr,si,ei);
        quicksort(arr, si, pdx-1);
        quicksort(arr, pdx+1, ei);

    }
    public static int partition(int arr[],int si,int ei){
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
        int arr[]={2,3,8,4,1,6};
        quicksort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }

        
    }
    
}
