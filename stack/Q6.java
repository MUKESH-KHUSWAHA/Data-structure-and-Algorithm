import java.util.Stack;

public class Q6 {
    public static int maxarea(int h[]){
        int n=h.length;
        int maxarea=0;
        int nls[]=new int[n];
        int nrs[]=new int[n];

        Stack<Integer>s=new Stack<>();
        // next smaller right
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty()&&h[i]<=h[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nrs[i]=6;

            }
            else{
                nrs[i]=h[s.peek()];
            }
            s.push(i);


        }
        // next smaller left
        for(int i=0;i<n;i++){
            while(!s.isEmpty()&&h[i]<=h[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                nls[i]=-1;

            }
            else{
                nls[i]=h[s.peek()];
            }
            s.push(i);

        }

        for(int i=0;i<n;i++){
            int width=nrs[i]-nls[i];
            int area=width*h[i];
            maxarea=Math.max(maxarea, area);
        }
        return maxarea;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,6,2,3};
       System.out.println( maxarea(arr));
        
    }
    
}
