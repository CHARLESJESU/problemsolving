import java.util.Arrays;

public class movezeros {
        public static void main(String[] args) {
        System.out.println(movezeroanswer(new int[]{0,1,0,3,12}));
    }
    static int movezeroanswer(int[] nums){
        int j=0,i=0;
       while(i<nums.length){
        if(nums[i]!=0){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j++;
          
        }
        i++;
       
       }
      System.out.print(Arrays.toString(nums));
        return j;
    }
}
