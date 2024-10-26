public class index11 {
    public static void main(String[] args) {
        int array[][]={{10,20,30,40},
                        {50,60,70,80},
                    {90,100,110,120},
                     {130,140,150,160}};
        int key=110;
        staircaseSearch1(array, key);        
    }
    public static boolean staircaseSearch(int array[][],int key){
        int row=0;
        int col=array[0].length-1;
        while (row<array.length&&col>=0) {
            if (array[row][col]==key) {
                System.out.print("index of key is  "+"("+row+","+col+")");
                return true;
            }
            else if(key<array[row][col]){
                col--;
            }
            else{
                row++;
            }
            
        }
        System.out.print("key not found");
        return false;

    
    }

    public static boolean staircaseSearch1(int array[][],int key){
        int row=array.length-1;
        int col=0;
        while (col<array.length&&row>=0) {
            if (array[row][col]==key) {
                System.out.print("index of key is  "+"("+row+","+col+")");
                return true;
            }
            else if(key<array[row][col]){
                row--;
            }
            else{
                col++;
            }
            
        }
        System.out.print("key not found");
        return false;

    }
    
}
