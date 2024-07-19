public class index5 {
    // public static int firstoccur(int arr[],int i,int key){
    //     if (arr[i]==arr.length-1) {
    //         return -1;
            
    //     }
    //     if (arr[i]==key)
    //         return i;
        
    //     return firstoccur(arr, i+1, key);

    // }
    public static int lastoccur(int arr[],int i,int key){
        // Base case: if index goes out of bounds, return -1
        if (i < 0)
            return -1;

        // If key is found at current index, return the index
        if (arr[i] == key)
            return i;

        // Recursively search in the remaining array elements
        return lastoccur(arr, key, i - 1);
    }



    
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 6, 3, 2, 4, 7, 8, 9};
        int key = 8;

        int lastIndex = lastoccur(arr, key, arr.length - 1);
        
        if (lastIndex != -1)
            System.out.println("Last occurrence of " + key + " is at index " + lastIndex);
        else
            System.out.println("Element not found in the array.");
    

        
    }
}
