public class index8{
    public static void spiral(int array[][]){
        int startrow=0;
        int startcol=0;
        int endrow=array.length-1;
        int endcol=array[0].length-1;
        while (startrow<=endrow&&startcol<=endcol) {
            // top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(array[startrow][i]+" ");
            }
            // right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(array[i][endcol]+" ");
            }
            // bottom
            for(int i=endcol-1;i>=startcol;i--){
                if (startrow==endrow){
                    return;
                } 
                System.out.print(array[endrow][i]+" ");
                

            }
            // left
            for(int i=endrow-1;i>=startrow+1;i--){
                if (startcol==endcol){
                    return;
                } 
                System.out.print(array[i][startcol]+" ");
            }
            startrow++;
            startcol++;
            endcol--;
            endrow--;
            System.out.println();
            
        }
       
    }
    public static void main(String[] args) {
        int array[][]={{1,2,3,0},
                       {4,5,6,0},
                       {7,8,9,0},
                       {10,11,12,0}};
        spiral(array);
                            
        
    }
}