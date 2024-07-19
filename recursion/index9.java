public class index9 {
    public static void main(String[] args) {
        System.out.println(friend(3));
        
    }
    public static int friend(int n){
        // base case
        if(n==1||n==2){
            return n;
        }
        // choice
        // single
        int fnm1=friend(n-1);
        // pair
        int fnm2=friend(n-2)*n-1;
        int totalways=fnm1+fnm2;
        return totalways;

    }
}
