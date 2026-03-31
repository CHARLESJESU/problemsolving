public class maxconsecutiveones {
    public static void main(String[] args) {
        System.out.print(maxconsecutiveonesanswer(new int[]{1,1,0,1,1,1}));
    }
    static int maxconsecutiveonesanswer(int[] nums){
        int count=0;
        int maxcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(maxcount<count){
                    maxcount=count;
                }
            }
            else{
                count=0;
            }
        }
        return maxcount;
    }
}
