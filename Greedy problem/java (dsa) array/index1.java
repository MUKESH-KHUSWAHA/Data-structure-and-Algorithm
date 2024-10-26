
public class index1 {
    public static void main(String[] args) {
        int number[]={1,4,3,6,5};
        printsubarray(number);
        
    }
    public static void printsubarray(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i< number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    
                    currsum +=number[k];
                    System.out.print(number[k]+" ");
                
                }
                System.out.println();
                System.out.println(currsum);
                if (maxsum<currsum) {
                    maxsum=currsum;
                    
                }
                System.out.println();
              
               
            }
           

            
        }
        System.out.println("total maxsumsubarrays = "+maxsum);

    }
    
        
}
