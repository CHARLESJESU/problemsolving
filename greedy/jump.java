package greedy;

public class jump {

          public static void main(String[] args){
System.out.print(canJump(new int[]{3,2,1,0,4}));
    }
    static boolean canJump(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]==0){break;}
            if(i==nums.length-1){
                return true;
            }
            i+=nums[i];
        }
        return false;
    }
}
