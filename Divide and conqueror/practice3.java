
public class practice3{
    public static String[] mergesort(String arr[],int si,int ei){
        //base case
        while(si>=ei){
            String A[]={arr[si]};
            return A;
        }
        // kaam
        int mid=(si+ei)/2;
        String arr1[]=mergesort(arr, si, mid);
        String arr2[]=mergesort(arr, mid+1, ei);
        String arr3[]=merge(arr1,arr2);
        return arr3;
    }
    static boolean alphabatically(String str1,String str2){
        if (str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static String[] merge(String arr1[],String arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        String temp[]=new String[m+n];
        int j=0;
        int i=0;
        int k=0;
        while(i<n&&j<m){
            if(alphabatically(arr1[i],arr2[j])){
                temp[k++]=arr1[i++];
            }
            else{
                temp[k++]=arr2[j++];
            }
        }
        while(i<n){
            temp[k++]=arr1[i++];
        }
        while(j<m){
            temp[k++]=arr2[j++];

        }
        return temp;
        
        
    }
    public static void main(String[] args) {
        String arr[]={"hello","mars","jupitar","sun","savita"};
        String a[]=mergesort(arr, 0, arr.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}