public class index {
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        printsubarray(number);
        
    }
    public static void printsubarray(int number[]){
        int ts=0;
        for(int i=0;i< number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            

            
        }
        System.out.println("total subarrays = "+ts);

    }

    
}
