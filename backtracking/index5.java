public class index5 {
    public static int gridways(int i,int j,int n,int m){
        // base case
        if(i==n-1&&j==m-1){
            return 1;
        }
        else if(i==n||j==n){
            return 0;
        }
        // dowm
        int fdn=gridways(i+1, j, n, m);
        // right
        int frn=gridways(i, j+1, n, m);

        return fdn+frn;

        

    }
    
    public static void main(String[] args) {
        int n=3;
        int m=3;
        System.out.println(gridways(0,0,n,m));
        
    }
}
