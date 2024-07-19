public class index4 {
    
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int fibo=fibonacci(n-1)+fibonacci(n-2);
        return fibo;
    }
    public static void main(String[] args) {
       System.out.println( fibonacci(4));
        
    }
}
