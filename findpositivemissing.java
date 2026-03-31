import java.util.Arrays;

public class findpositivemissing {
    public static void main(String[] args) {
        System.out.println(findpositivemissinganswer(new int[]{1,2,0}));
    }
   static int findpositivemissinganswer(int[] nums){
    for(int i=0;i<nums.length;i++){
        while(nums[i]>0 && nums[i]<=nums.length && nums[nums[i]-1]!=nums[i]){
            int temp=nums[nums[i]-1];
            nums[nums[i]-1]=nums[i];
            nums[i]=temp;
        }
    }
    int i;
    for(i=0;i<nums.length-1;i++){
        if(nums[i]!=i+1){
            return i+1;
        }
    }
        return nums.length+1;
    }
}
