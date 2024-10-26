import java.util.LinkedList;
import java.util.ArrayList;

public class HashMapCode {
    static class  HashMap <K,V> { 
        // creating structure of node
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
           
        }

        // create array of linked list;
        LinkedList<Node>Buckets[]=new LinkedList[4];
        private  int N;
        private  int n;

        // contructor
        @SuppressWarnings("unused")

        public HashMap(){
            for(int i=0;i<Buckets.length;i++){
                this.N=4;
                this.n=0;
                Buckets[i]=new LinkedList<>();

            }

        }
        private int hashFunction(K key){
            int hc=key.hashCode(); // give an integer
            return Math.abs(hc)%N;  // value must be between 0 to N-1;
        }
        private int SearchinLL(K key,int bi){
            LinkedList<Node>ll=Buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++){
                Node node=ll.get(i);
                if(node.key==key){
                    return di;
                }
                di++;
            }
            return -1;
        }
        private void rehash(){
            // store bucket in old bucket
            LinkedList<Node>oldbuck[]=Buckets;
            Buckets=new LinkedList[2*N];
            N=2*N;
            for(int i=0;i<Buckets.length;i++){
                Buckets[i]=new LinkedList<>();
            }
            // add node in bucket
            for(int i=0;i<oldbuck.length;i++){
                LinkedList<Node>ll=oldbuck[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.get(j);
                    put(node.key, node.value);
                }
            }
        }
        public void put(K key,V value){
            double threshold_value=2.0;
            int bi=hashFunction(key);
            int di=SearchinLL(key,bi);
            if(di!=-1){
                Node node=Buckets[bi].get(di);
                node.value=value;
            }
            else{
                Buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>threshold_value){
                rehash();
            }
        }
        public V get(K key){
            double threshold_value=2.0;
            int bi=hashFunction(key);
            int di=SearchinLL(key,bi);
            if(di!=-1){
                Node node=Buckets[bi].get(di);
                return node.value;
            }
            else{
                return null;
            }

        }
        public boolean containsKey(K key){
            double threshold_value=2.0;
            int bi=hashFunction(key);
            int di=SearchinLL(key,bi);
            if(di!=-1){
                return true;
            }
            else{
                return false;
            }
        }
        public V remove(K key){
            double threshold_value=2.0;
            int bi=hashFunction(key);
            int di=SearchinLL(key,bi);
            if(di!=-1){
                Node node=Buckets[bi].remove(di);
                return node.value;
            }
            else{
                return null;
            }
        }
        public ArrayList<K> keySet(){
            ArrayList<K>keys=new ArrayList<>();
            for(int i=0;i<Buckets.length;i++){
                LinkedList<Node>ll=Buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                    
                }
            }
            return keys;

        }
        public boolean isEmpty(){
            return n==0;
        }
     
    }

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("india", 10);
        hm.put("Africa", 20);
        hm.put("Iran", 30);
        ArrayList<String>keys=hm.keySet();
        for (String key: keys) {
            System.out.println(key);
            
        }
        System.out.println(hm.get("india"));
        hm.remove("india");
        System.out.println(hm.get("india"));




        
    }
}
