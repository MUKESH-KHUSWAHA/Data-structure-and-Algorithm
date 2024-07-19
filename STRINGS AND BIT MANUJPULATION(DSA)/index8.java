public class index8 {
    public static void main(String[] args) {
         String vowels="rvcbejkbngiunmie";
         lowercasevowels(vowels);


    }
    public static void lowercasevowels(String vowels){
        int count=0;
        for(int i=0;i<vowels.length();i++){
            char ch= vowels.charAt(i);
            if (ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                System.out.print(vowels.charAt(i)+" ");
                count++;

            }
        }
    }
}
