public class index1 {
    public static int factorial(int n){
        // base case
        if(n==0){
            return 1;
        }
        // call function
        int fnm1=factorial(n-1);
        int fn=factorial(n-1)*n;
        return fn;

    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        
    }
}