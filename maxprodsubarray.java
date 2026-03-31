public class maxprodsubarray {
    public static void main(String[] args) {
        System.out.print(maxprodsubarrayanswer(new int[]{-2,0,-1}));
    }
    static int maxprodsubarrayanswer(int[] nums){
        int sp=1;
        int mp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i+=2){
            if(nums[i]>0&&nums[i+1]>0){
                sp*=nums[i]*nums[i+1];
            }
            else if(nums[i]<0&&nums[i+1]<0){
                sp*=nums[i]*nums[i+1];
            }
            else if(sp>mp){
                mp=sp;
            }
            else{
                sp=1;
            }
        }
        return mp;
    }
}
