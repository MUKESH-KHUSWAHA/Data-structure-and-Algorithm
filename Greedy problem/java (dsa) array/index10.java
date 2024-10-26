public class index10 {
    public static void main(String[] args) {
        int array[][]={{10,20,30,40},
                        {50,60,70,80},
                    {90,100,110,120},
                     {130,140,150,160}};
            int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 17, 20},
                {23, 30, 34, 60}
            };
            int target = 16;
            System.out.println(searchMatrix(matrix, target));
        }
       
        
    
    public static void search(int array[][],int key){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if (array[i][j]==key) {
                    System.out.print("index of key is  "+"("+i+","+j+")");   
                }
            }
        }
    }
        
        public static boolean searchMatrix(int[][] matrix, int target) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
                return false;
            
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            int left = 0;
            int right = rows * cols - 1;
            
            while (left <= right) {
                int mid = left + (right - left) / 2;
                int midValue = matrix[mid / cols][mid % cols];
                
                if (midValue == target)
                    return true;
                else if (midValue < target)
                    left = mid + 1;
                else
                    right = mid - 1;
            }
            
            return false;
        }
    
    
}
