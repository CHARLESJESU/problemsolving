public class maximumgasstation{
    public static void main(String[] args) {
        System.out.print(maximumgasstationanswer(new int[]{23, 24, 36, 39, 46, 56, 57, 65, 84, 98}, 1));
    }
    static double maximumgasstationanswer(int[] nums,int k){
        double low=0;
        double high=nums[nums.length-1]-nums[0];
        while(high-low>1e-6){
            double mid=low+(high-low)/2.0;
            if(candividedusingk(nums,k,mid)){   
                high=mid;
            }
            else{
                low=mid;
            }
        }
    return low;
    }
        static boolean candividedusingk(int[] nums,int k,double divide){
            int count=0;
            for(int i=0;i<nums.length-1;i++){
                count+=(int)((nums[i+1]-nums[i])/divide);
            }
            return count<=k;
        }
}