public class index4 {
    public static int search(int arr[],int tar,int si,int ei){
        int mid=(si+ei)/2;

        if(tar==arr[mid]){
            return mid;
        }
        // for l1 line 
        if (arr[si]<=arr[mid]) {
            // case1 leftside
            if(tar>=arr[si]&&tar<=arr[mid]){
                return search(arr, tar, si, mid-1);

            }
            // case2 for right side
            else{
                return search(arr, tar,mid+1 , ei);
            }
            
        }
        else{
            if (tar>=arr[mid]&&tar<=arr[ei]) {
                search(arr, tar, mid+1, ei);
            }
            else
            {
                return search(arr, tar, si, mid-1);
            }


        }
        return mid;
        
        
        
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        int idx=search(arr, 0, 0, arr.length-1);
        System.out.println(idx);
    }
}
