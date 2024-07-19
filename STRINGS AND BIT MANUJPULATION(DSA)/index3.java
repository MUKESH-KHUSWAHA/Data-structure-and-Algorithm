import java.util.*;
public class index3 {
    public static void main(String[] args) {
        System.out.print("Give direction of a route as Example-: EWNSSW \nE stand for EAST\nW stand for WEST\nN stand for NORTH\nS stand for SOUTH -->");
        String direction;
        Scanner sc= new Scanner(System.in);
        direction=sc.nextLine();
        String DIRECTION = direction.toUpperCase();
        shortestpath(DIRECTION);
       
    }
    public static void shortestpath(String DIRECTION){
        int x=0;
        int y=0;
        for(int i=0;i<DIRECTION.length();i++){
            if (DIRECTION.charAt(i)=='N') {
                y++;
            
            }
            else if (DIRECTION.charAt(i)=='S') {
                y--;
            
            }
            else if (DIRECTION.charAt(i)=='E') {
                x++;

            
            }
            else if (DIRECTION.charAt(i)=='W') {
                x--;
            
            }
            else{
                System.out.println("invalid input ");
                
            }

        }
        float D=(float) Math.sqrt(x*x+y*y);
        System.out.println("The coordinate of point are "+"("+x+","+y+")");
        System.out.println("The shortest distance of point from origin is "+D);
        
    }
}
