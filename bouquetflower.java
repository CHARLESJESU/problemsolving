import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bouquetflower {
    public static void main(String[] args) {
        System.out.print(bouquetfloweranswer(new int[]{7,7,7,7,12,7,7},2,3));
    }
    static int bouquetfloweranswer(int[] bloomDay,int m, int k){
        if(m*k>bloomDay.length){return -1;}
        int low=1;
        int high=0;
        int result=-1;
        for(int num: bloomDay){
            high=Math.max(high, num);
            low=Math.min(low,num);
        }
        while (low<=high) {
            int mid=low+(high-low)/2;
            if(ispossibleblooms(bloomDay, m, k, mid)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        
        return result;
    }
    static boolean ispossibleblooms(int[] nums,int m, int k, int days){
        int flowers=0;
        int bouquet=0;
        for(int bloomdays:nums){
            if(bloomdays<=days){
                flowers++;
                if(flowers==k){
                    bouquet++;
                    flowers=0;
                }
            }
            else{
                flowers=0;
            }
        }
        return bouquet>=m;
    }
}
