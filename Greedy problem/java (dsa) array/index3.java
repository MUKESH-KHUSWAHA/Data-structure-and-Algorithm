public class index3 {
    public static void kadans(int number[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
  
    
            
        
        for(int i=0;i<number.length;i++){
            currsum +=number[i];
            if (currsum<0) {
                currsum=0;
                
            }
            maxsum=Math.max(currsum,maxsum);

        }
        System.out.println("the maximum sum "+ maxsum);



    }
    public static void main(String[] args) {
        int number[]={1,2,3-4,5,-7,9,6};
        kadans(number);
        
    }
}
