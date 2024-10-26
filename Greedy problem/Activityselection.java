import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activityselection{
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        
        int Start[]={0,1,3,5,5,8};
        int end []= {6,2,4,7,9,9};
        int maxact=0;
        // sort according to end
        int Activites[][]=new int[end.length][3];
        for(int i=0;i<end.length;i++){
            Activites[i][0]=i;
            Activites[i][1]=Start[i];
            Activites[i][2]=end[i];
        }
        Arrays.sort(Activites,Comparator.comparingDouble(o->o[2]));
        ArrayList<Integer> ans=new ArrayList<>();
        // ist activity
        maxact=1;
        ans.add(Activites[0][0]);
        int lastend=Activites[0][2];
        for(int i=1;i<end.length;i++){
            if( Activites[i][1]>lastend){
                maxact++;
                ans.add(Activites[i][0]);
                lastend=Activites[i][2];
            }

        }
        System.out.println("max activities "+maxact);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();




        }
    }
