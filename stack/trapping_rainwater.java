import java.util.*;
public class trapping_rainwater {
    public static int maxwater(int height[]){
        int n=height.length;
        Stack<Integer>s=new Stack<>();
        int ans=0;
        for (int i=0;i<n;i++){
            while(!s.isEmpty()&&height[s.peek()]<height[i]){
                int pop_height=height[s.peek()];
                s.pop();
                if(s.isEmpty()){
                    break;
                }
                int distance=i-s.peek()-1;
                int minheight=Math.min(height[s.peek()], height[i])-pop_height;
                ans+=distance*minheight;
        }
        s.push(i);

        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={7,0,4,2,5,0,6,4,0,5};
        System.out.println(maxwater(arr));
        
    }
}
