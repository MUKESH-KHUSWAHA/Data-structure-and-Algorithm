public class index5 {
    @SuppressWarnings("unused")
    public static void bubblesort(int array[]){
        for (int i=0;i<array.length-1;i++){
            int swap=0;
            for(int j=0;j<array.length-1-i;j++){
                if (array[j]<array[j+1]) {
                    // swap
                    int c=array[j];
                     array[j]=array[j+1];
                     array[j+1]=c;   
                }
            }
        }

    }
    public static void selectionsort(int array[]){
        for (int i=0;i<array.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<array.length-1;j++){
                if(array[minpos]<array[j]){
                    minpos=j;
                }
               
            }
             // swap
             int c=array[minpos];
             array[minpos]=array[i];
             array[i]=c;
        }
    }
    public static void insertionsort(int array[]){
        for (int i=0;i<=array.length-1;i++){
            int curr=array[i];
            int prev=i-1;
            // to find the index where curr is to be inserted
            while(prev>=0&&array[prev]<curr){
                array[prev+1]=array[prev];
                prev--;
            }
            array[prev+1]=curr;

        }
    }
    public static void main(String[] args) {
        int array[]={3,6,2,1,8,7,4,5,3,1};
        // bubblesort(array);
        // selectionsort(array);
        insertionsort(array);

        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }

        
    }
}
