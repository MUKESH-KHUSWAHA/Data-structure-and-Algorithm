import java.util.Stack;

public class Q5 {
    public static void main(String[] args) {
        // next greatest integer right side
        //  -1 represent not found 
        int arr[]={6,8,0,1,3};
        int nextgreater[]=new int[arr.length];
        Stack<Integer>s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            // first while loop
            while(!s.isEmpty()&&arr[s.peek()]<=arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }
            else{
                nextgreater[i]=arr[s.peek()];
            }
            s.push(i);
        

        }
        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();


        // for leftside greatest integer
    // reverse for loop
       //  for right side smaller integer
    // reverse greater than condition  peek>arr[i]
        // for left side samller
    // reverse loop and greater than condition peek>arr[i]

    }
        
}

    
