public class index4 {
    public static void main(String[] args) {
        String friut[]={"mango","banana","apple","manro"};
        String largest=friut[0];
        for(int i=0;i<friut.length;i++){
            if(largest.compareTo(friut[i])<0){
                largest=friut[i];

            }
        }
        System.out.println(largest);
    }
    
}
