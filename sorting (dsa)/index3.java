public class index3 {
    public static void main(String[] args) {
        int array[]={1,6,3,4,5};
        insertionsort(array);
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }
        
    }
    public static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int curr=array[i];
            int prev=i-1;
            // finding out the current position 
            while (prev>=0&&array[prev]>curr) {
                array[prev+1]=array[prev];
                prev--;    
            }
            array[prev+1]=curr;

        }
        
    
    }
}
