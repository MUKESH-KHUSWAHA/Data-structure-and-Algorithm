import java.util.*;
public class index7 {
    public static void main(String[] args) {
        int array[][]=new int[3][3];
        int no_of_rows=3;   //array.length gives you number of rows
        int no_of_colms=3;  //array[0].length gives you number of columns
        Scanner sc=new Scanner(System.in);
        for(int row=0;row<no_of_rows;row++){
            for(int colm=0;colm<no_of_colms;colm++){
                array[row][colm]=sc.nextInt();
            }
        }
        // output
        for(int i=0;i<no_of_rows;i++){
            for(int j=0;j<no_of_colms;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
