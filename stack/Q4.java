import java.util.Stack;

public class Q4 {
    public static void stockspan(int price[],int span[]){
        Stack<Integer>s=new Stack<>();
        span[0]=1;
        s.push(0);
        for(int i=1;i<price.length;i++){
            int currprice=price[i];
            while(!s.isEmpty()&& currprice>price[s.peek()]){
                s.pop();
            }
            if(s.isEmpty()){
                span[i]=i+1;

            }
            else{
                int prevhigh=s.peek();
                span[i]=i-prevhigh;
            }
            s.push(i);
        }

    }
    public static void main(String[] args) {
        int price[]={100,80,60,70,60,85,100};
        int span[]=new int[price.length];
        stockspan(price, span);
        for(int i=0;i<span.length;i++){
            System.out.print(span[i]+" ");
        }
    }
}
