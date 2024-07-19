public class index11 {
    public static void main(String[] args) {
        int n=8;
        oddeven(n);
        
    }
    @SuppressWarnings("unused")
    public static void oddeven(int n){
        int bitmask=1;
        if ((n&bitmask)==0) {
            System.out.println(n+" is an even number");
            
        }
        else{
            System.out.println(n+" is an odd number");
        }
        

    }
}
