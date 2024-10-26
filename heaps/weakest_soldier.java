import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class weakest_soldier {
    static class row implements Comparable<row>{
        int soldier;
        int idx;
        row(int idx,int soldier){
            this.idx=idx;
            this.soldier=soldier;
        }
        @Override
        public int compareTo(row r2){
            if(this.soldier==r2.soldier){
                return this.idx-r2.idx;
            }
            return this.soldier-r2.soldier;

        }
    }
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},{1,1,1,1},{1,0,0,0},{1,0,0,0}};
        int k=2;
        PriorityQueue<row>pq=new PriorityQueue<>();
        int count=0;
        for(int i=0;i<army.length;i++){
            for (int j=0;j<army.length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new row(i, count));
            

        }
        for(int i=0;i<k;i++){
            System.out.println("R"+pq.remove().idx);
        }
        
    }
}
