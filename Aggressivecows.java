
import java.util.*;

public class Aggressivecows {
     public static void main(String[] args) {
        System.out.print(Aggressivecows(new int[] {1, 2, 8, 4, 9}, 3));
    }
    static int Aggressivecows(int[] stall,int cows){
        Arrays.sort(stall);
        int maxdistance=1;
    
            int low=1;
            int high=stall[stall.length-1];
            
            while(low<=high){
                int mid=low+(high-low)/2;
                int adjecentcow=stall[0];
                int k=1;
                for(int i=1;i<stall.length;i++){
                    int diff=stall[i]-adjecentcow;
                    if(diff>=mid){
                        adjecentcow=stall[i];
                        k++;
                    }
                }
                if(cows==k){

                    maxdistance=Math.max(maxdistance, mid);
                }
                if( cows>k){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }

      
        return maxdistance;
    }
}
