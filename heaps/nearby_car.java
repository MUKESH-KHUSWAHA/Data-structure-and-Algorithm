import java.util.*;
public class nearby_car {
    static class point implements Comparable<point>{
        int x;
        int y;
        int distsqr;
        int i;

        point(int x,int y,int distsqr,int i){
            this.x=x;
            this.y=y;
            this.distsqr=distsqr;
            this.i=i;
        }
        @Override
        public int compareTo(point p1){
            return this.distsqr-p1.distsqr;
        }


    }

    public static void main(String[] args) {
        int arr[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<point>pq=new PriorityQueue<>();
        for(int i=0;i<arr.length-1;i++){
            int distsqr=arr[i][0]*arr[i][0]+arr[1][i]*arr[1][i];
            pq.add(new point(arr[i][0], arr[1][i], distsqr,i+1));

        }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().i);
        }
        
    }
}
