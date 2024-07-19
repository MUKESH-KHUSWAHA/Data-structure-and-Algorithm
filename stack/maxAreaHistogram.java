public class maxAreaHistogram {
    // first question solved by me without any help
    public static int max_Area_In_Histogram(int arr[] ){
        int n=arr.length;
        int lm_index[]=new int[n];
        int rm_index[]=new int [n];
        int width[]=new int[n];
        int area[]=new int [n];

        // left smallest
        lm_index[0]=0;
        for (int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[j]<arr[i]){
                    lm_index[i]=j+1;
                    break;
                }
            }
        }
        // right smallest
        rm_index[n-1]=n-1;
        for (int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    rm_index[i]=j;
                    break;
                }
                
            }
        }
        // width

        for(int i=0;i<n;i++){
            width[i]=rm_index[i]-lm_index[i];

        }
        // area
        for(int i=0;i<n;i++){
            area[i]=width[i]*arr[i];
        }
        int max=area[0];
        for(int i=1;i<area.length;i++){
            if(area[i]>max){
                max=area[i];
            }
        }
        return max ;
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,6,2,3};
       System.out.println( max_Area_In_Histogram(arr));
    }
}
