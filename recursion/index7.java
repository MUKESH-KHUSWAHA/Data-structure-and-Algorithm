public class index7 {

    public static void main(String[] args) {
        
        System.out.println(tilesproblem(3));
    }
    public static int tilesproblem(int n){             //(2xn) floor and tile is 2x1
    //    base case
        if(n==0||n==1){
            return 1;
        }
        // choice
        // vertical
        int fnm1=tilesproblem(n-1);
        // horizontal
        int fnm=tilesproblem(n-2);
        int totalways=fnm+fnm1;
        return totalways;

    }
}