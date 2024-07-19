public class index1{
    @SuppressWarnings("unused")

    static int count=0;

    public static boolean isSafe(char chessboard[][],int row,int col){
        // vertical up
        for(int i=row-1;i>=0;i--){
            if(chessboard[i][col]=='Q'){
                return false;

            }
        } 
        // left diagonal
        for(int i=row-1,j=col-1; i>=0 && j>=0;i--,j--){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        // right up diagonal
        for(int i=row-1,j=col+1;i>=0&&j<chessboard.length;i--,j++){
            if(chessboard[i][j]=='Q'){
                return false;
            }
        }
        return true;
        

    }
    public static void printboard(char chessboard[][]){
        System.out.println("_________ChessBoard________");
        for(int i=0;i<chessboard.length;i++){
            for(int j=0;j<chessboard[0].length;j++){
                System.out.print(chessboard[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static boolean nQueen(char chessboard[][],int row){
        // base case
        if(row==chessboard.length){
            // printboard(chessboard);
            count++;
            return true;

        }
        // column loop
        for(int j=0;j<chessboard.length;j++){
           if(isSafe(chessboard, row, j)){
            chessboard[row][j]='Q';
            if(nQueen(chessboard, row+1)){
                return true;
            }
            chessboard[row][j]='-';    //backtracking


           }

        }
        return false;
    }

    // public static void nQueen(char chessboard[][],int row){
    //     // base case
    //     if(row ==chessboard.length){
    //         printboard(chessboard);
    //         count++;
    //         return;

    //     }
    //     // column loop
    //     for(int j=0;j<chessboard.length;j++){
    //         if(isSafe(chessboard,row,j)){
    //             chessboard[row][j]='Q';
    //             nQueen(chessboard, row+1); //function call
    //             chessboard[row][j]='-';    //backtracking


    //         }
            


        // }
    // }
    public static void main(String[] args) {
        // place n queen on nxn chess board such that 2 queen cannot attack each other
        int n=4;
        char chessboard[][]=new char[n][n];
        // initilization
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessboard[i][j] ='-';
            }
        }
        if(nQueen(chessboard,0)){
            System.out.println("solution is possible");
            printboard(chessboard);
        }
        else{
            System.out.println("solution is not possible");
        }
        System.out.println();
        System.out.println("total number of ways to place queen are -:"+count);
        System.out.println();

    }
}