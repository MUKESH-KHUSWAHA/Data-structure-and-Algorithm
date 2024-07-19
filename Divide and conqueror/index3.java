public class index3 {
    public static String[] mergesort(String arr[],int si,int ei){
        while(si>=ei){
            String[] A={arr[si]};
            return A;
        
        }
        int mid=(si+ei)/2;
        String arr1[]=mergesort(arr, si, mid);
        String arr2[]=mergesort(arr, mid+1, ei);
        String arr3[]=merge(arr1,arr2);
        return arr3;
    }
    public static boolean alphabetically( String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }
        return false;
    }
    public static String[] merge(String arr1[],String arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        String temp[]=new String[m+n];
        int i=0;
        int j=0;
        int k=0;
        while(i<m&&j<n){
            if(alphabetically(arr1[i],arr2[j] )){
                temp[k]=arr1[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            temp[k++]=arr1[i++];
        }
        while(j<n){
            temp[k++]=arr2[j++];
        }
        return temp;

    }
    public static void main(String[] args) {
        String arr[]={"apple","mars","mercury","orange","hen"};
        String a[]=mergesort(arr, 0, arr.length-1);
        for(int i=0;i<a.length-1;i++){
            System.out.print(a[i]+" ");
        }

    }
}
