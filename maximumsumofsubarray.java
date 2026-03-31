public class maximumsumofsubarray {
    public static void main(String[] args) {
        System.out.print(maximumsumofsubarrayanswer(new int[]{5,4,-1,7,8}));
    }
    static int maximumsumofsubarrayanswer(int[] nums){
        if(nums.length==0||nums.length==1){return nums[0];}
         int sum=0;
            int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
           
            
                sum+=nums[i];
                if(max<sum){
                    max=sum;
                }
          
            if(sum<=0){
                sum=0;
            }
        }
        return max;
    }
}
