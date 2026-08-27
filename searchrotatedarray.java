public class searchrotatedarray {
    public static void main(String[] args) {
        System.out.print(searchrotatedarrayanswer(new int[]{7,6,5,1,2,3,4}, 4));
    }
    static int searchrotatedarrayanswer(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while (start<end) {
           int mid=start+(end-start)/2;
           if(nums[mid]==target){
            return mid;
           }
           
           if(nums[end]<target  ){
            end=mid-1;
           }
           if(nums[start]>target){
            start=mid+1;
           }
        }
        return -1;
    }
}
