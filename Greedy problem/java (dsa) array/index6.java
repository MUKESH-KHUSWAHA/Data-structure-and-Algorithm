public class index6 {
    public static boolean duplicate(int array[]){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]==array[j]) {
                    return true;  
                }      
            }
        }
        return false;
    }
    public static void maxprofit(int prices[]){
        int maxprofit=0;
        int buyprices=Integer.MAX_VALUE;
        for(int i=0;i<prices.length-1;i++){
            if (buyprices<prices[i]) {
                int profit=prices[i]-buyprices;
                maxprofit=Math.max(maxprofit, profit);
                
            }
            else{
                buyprices=prices[i];
            }
        }
        System.out.println(maxprofit);

    }
    public static void  water(int height[]){
        int n=height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n-1;i++){
            leftmax[i]=Math.max(leftmax[i-1], height[i]);
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>0-1;i--){
            rightmax[i]=Math.max(rightmax[i+1], height[i]);
        }
        int trapped=0;
        for(int i=0;i<n-1;i++){
            int waterlevel=Math.min(leftmax[i], rightmax[i]);
            trapped+=waterlevel-height[i];
        }
        System.out.println(trapped);
       
    }
    
    public static void main(String[] args) {
        int array[]={1,2,3,3,6,7,4};
        int height[]={0,1,0,2,1,3,2,1,2,1};
        System.out.println(duplicate(array));
        maxprofit(array);
        

    }
}
