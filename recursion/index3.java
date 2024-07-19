public class index3 {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int sum10=n+sum(n-1);
        return sum10;
    }
    public static void main(String[] args) {
        System.out.println(sum(10));

    }
}
