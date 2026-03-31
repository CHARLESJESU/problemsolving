package binarysearchsolutions;

class searchinrotatedsortarraysolution{
        public int search(int[] nums, int target) {
            
            // int result=binarysearchsolutions(nums, target);
            int pivot=findpivotelement(nums,target);
            if(pivot==-1){
                return binarysearchsolutionsforasc(nums, target,0,nums.length-1);
            }
            else{
                if(nums[pivot]==target){
                    return pivot;
                }
              if(nums[nums.length-1]<=target){
                    return binarysearchsolutionsforasc(nums, target,0,pivot-1);
                }
            
                
            }

        return binarysearchsolutionsforasc(nums, target,pivot+1,nums.length-1);
    }
    private int findpivotelement(int[] nums, int target) {
          int start=0;
        int end=nums.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
          if(mid<end && nums[mid+1]<nums[mid]){
            return mid;
          }
          if(mid>start && nums[mid-1]>nums[mid]){
return mid-1;
          }
          if(nums[start]>=nums[mid]){
            end=mid-1;
          }
          else{
            start=mid+1;
          }
         
        }
        return -1;
        }
    private int binarysearchsolutionsforasc(int[] nums, int target,int start, int end){

        while (start<=end) {
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
              
                end=mid-1;
            }
            else if(nums[mid]<target){
                  start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
       
}
public class searchinrotatedsortarray {
    public static void main(String[] args) {
        searchinrotatedsortarraysolution s=new searchinrotatedsortarraysolution();
        int result=s.search(new int[]{4,5,6,7,0,1,2},5);
        System.out.print(result);
    }
}
