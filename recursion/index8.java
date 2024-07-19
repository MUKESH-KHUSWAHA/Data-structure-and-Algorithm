public class index8 {
    public static void main(String[] args) {
        String str="apnnacolllege";
        removedublicate(str, 0, new StringBuilder(""),new boolean[26]);
        
    }
    public static void removedublicate(String str,int idx,StringBuilder newstr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char curr=str.charAt(idx);
        if(map[curr-'a']==true){
            removedublicate(str, idx+1, newstr, map);

       }
       else{
            map[curr-'a']=true;
            removedublicate(str, idx+1, newstr.append(curr), map);
       }
    }
}
