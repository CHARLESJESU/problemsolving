import java.util.Arrays;

public class removeduplicates {
    public static void main(String[] args) {
        System.out.println(removeduplicatesanswer(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
    static int removeduplicatesanswer(int[] nums){
        int j=1;
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
             nums[j++]=nums[i+1];
        }
       
       }
      
        return j;
    }
}
