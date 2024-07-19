public class index6 {
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        System.out.println(optimisepow(2,3));
        
    }
    public static int pow(int a,int n){
        if(n==0){
            return 1;
        }
        int pxn=a*pow(a,n-1);
        return pxn;
    }
    public static int optimisepow(int a,int n){
        if (n == 0)
            return 1;
        
        // Recursively calculate power
        int result = optimisepow(a, n / 2);
        
        // If exponent is even
        if (n % 2 == 0)
            return result * result;
        // If exponent is odd
        else
            return a * result * result;
    }

}


