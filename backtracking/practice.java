public class practice {
    public static void printarr(int []arr){
        for(int i=0;i<=arr.length-1;i++){
            System.out.print((arr[i])+" ");
        }
        System.out.println();
    }

    // public static void change(int arr[],int i,int value){
    //     if(i==arr.length){
    //         printarr(arr);
    //         return;
    //     }
    //     arr[i]=value;
    //     change(arr,i+1,value+1);
    //     arr[i]=arr[i]-2;
    // }


    
    // public static void subset(String str,String ans,int i){
    //     // base case
    //     if(i==str.length()){
    //         if(ans.length()==0){
    //             System.out.println("null");
    //         }
    //         else{
    //             System.out.println(ans);

    //         }
    //         return;
        
    //     }
    //     // recursion
    //     // yes
    //     subset(str, ans+str.charAt(i), i+1);
    //     // no
    //     subset(str, ans, i+1);

    // }

    
    // public static void permutation(String str,String ans) {
    //     // base case
    //     if ( str.length()==0){
    //         System.out.println(ans);
    //         return;

    //     }
    //     // recursion
    //     for(int i=0;i<str.length();i++){
    //         char curr=str.charAt(i);
    //         String newstr=str.substring(0, i)+str.substring(i+1);
    //         permutation(newstr, ans+curr);
    //     }

    // }


    static int  count=0;
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




    public static void nQueen(char chessboard[][],int row){
    // base case
    if(row==chessboard.length){
        printboard(chessboard);
        count++;
        return ;

    }
    // column loop
    for(int j=0;j<chessboard.length;j++){
        if(isSafe(chessboard, row, j)){
        chessboard[row][j]='Q';
        nQueen(chessboard,row+1);

        chessboard[row][j]='-';    //backtracking


        }

    }
}





    @SuppressWarnings("unused")
    public static void main(String[] args) {

        // int arr[]=new int[5];
        // change(arr, 0, 1);
        // printarr(arr);



        // String str="abc";
        // subset(str, "", 0);

        // String str="abc";
        // permutation(str, "");



        // place n queen on nxn chess board such that 2 queen cannot attack each other
        int n=4;
        char chessboard[][]=new char[n][n];
        // initilization
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                chessboard[i][j] ='-';
            }
        }
        nQueen(chessboard, 0);

        System.out.println();
        System.out.println("total number of ways to place queen are -:"+count);
        System.out.println();






        
    }
}