import java.util.*;
public class insert_heap {
     static class heap{
        ArrayList<Integer>H=new ArrayList<>();

        public void add(int data){
            H.add(data);
            int x=H.size()-1;
            int par=(x-1)/2 ;
            while(H.get(x)<H.get(par)){
                // swap
                int temp=H.get(x);
                H.set(x,H.get(par));
                H.set(par, temp);
                x=par;
                par=(x-1)/2 ;


            }

        }
        private void heapify(int i){

            int left=2*1+1;
            int right=2*i+2;
            int minidx=i;
            if(left<H.size()&&H.get(minidx)>H.get(left)){
                minidx=left;
            }
            if(right<H.size()&&H.get(minidx)>H.get(right)){
                minidx=right;
            }
            if(minidx!=i){
                int temp=H.get(i);
                H.set(i,H.get(minidx));
                H.set(minidx, temp);
                heapify(minidx);

            }

        }
        public int peak(){
            return H.get(0);
        }
        public int remove(){
            int data=H.get(0);
            // swap
            int temp=H.get(0);
            H.set(0,H.get(H.size()-1));
            H.set(H.size()-1,temp);
            // remove last index
            H.remove(H.get(H.size()-1));
            // hepify
            heapify(0);

            return data;

        }
        public boolean isEmpty(){
            return H.size()-1==0;
        }
        
        

    }
    public static void main(String[] args) {
        heap h=new heap();
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(5);
        h.add(10);
        h.add(1);
        // h.print();
        while (!h.isEmpty()) {
            System.out.println(h.peak());
            h.remove();
        }


        
    }
}
