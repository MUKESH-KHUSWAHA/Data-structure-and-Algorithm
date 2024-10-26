public class index9 {
    public static void main(String[] args) {
        int array[][]={{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        diagonalsum(array);
        
    }
    public static void diagonalsum(int array[][]){
        int sum=0;

        // brute force
//         for(int i=0;i<=array.length-1;i++){
//             for(int j=0;j<array[0].length;j++){
//                 if (i==j||i+j==array.length-1) {
//                     sum+=array[i][j];                
//                 }           
//             }
//         }
//         System.out.println(sum);

    // optimised
     for(int i=0;i<=array.length-1;i++){
        sum+=array[i][i];
        if (i!=array.length-1-i) {
           sum+= array[i][array.length-1-i];

            
        }
     }
     System.out.println(sum);

    
    }


 }
