public class index13 {
    public static void print(int[][]array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int row=3, col=3;
        int array[][]={{4,5,6},{5,9,0},{9,8,7}}; 
        print(array);
        int[][]transpose=new int [col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=array[i][j];

            }
        }
        System.out.println();
        print(transpose);



    }
    
}
