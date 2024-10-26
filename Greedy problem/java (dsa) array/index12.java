public class index12 {
    public static void main(String[] args) {
        int array[][]={{4,5,6},{5,9,0},{9,8,7}}; 
        int count=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                if (array[i][j]==5) {
                    count++;
                    
                }
            }
        } 
        System.out.println(count);

        
        int sum=0;
        for(int j=0;j<array.length;j++){
            sum+=array[1][j];    
            }

        System.out.println(sum);
        }
        
            
            
            
        
        
        
    }

