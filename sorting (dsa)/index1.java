public class index1{
    public static void bubblesort(int array[]){
        int count=0;
        for (int i=0;i<array.length-1;i++){
            int swap=0;
            for (int j=0;j<array.length-1-i;j++){
                if (array[j]>array[j+1]) {
                    // swap
                    int c=array[j];
                    array[j]=array[j+1];
                    array[j+1]=c;
                    swap++;
                    count++;
                } 
            }
            if(swap==0){
                break;
            }        
        }
        System.out.println(count);
    
    }
    public static void main(String[] args) {
        int array[]={2,4,1,3,5};
        bubblesort(array);
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }

        
    }
}