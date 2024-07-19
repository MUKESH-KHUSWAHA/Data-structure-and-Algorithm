public class index2 {
    public static void main(String[] args) {
        int array[]={1,6,3,4,5};
        selectionsort(array);
        for(int i=0;i<=array.length-1;i++){
            System.out.print(array[i]+" ");
        }

        
    }
        
    
    public static void selectionsort(int array[]){
        for (int i=0;i<array.length-1;i++){
            int minpos=i;
            for (int j=i+1;j<array.length;j++){
                
                if (array[minpos]>array[j]) {
                    minpos=j;    
                } 
                
            }
            // swap
            int c=array[minpos];
            array[minpos]=array[i];
            array[i]=c;
               
        }
    
    }
    
}
