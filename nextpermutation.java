import java.util.Arrays;

public class nextpermutation {
    public static void main(String[] args) {
        int[] arr={4,3,2,1};
        nextpermutationanswer(new int[]{4,3,2,1});
        System.out.print(Arrays.toString(arr));
    }
    static void nextpermutationanswer(int[] nums){
        if(nums.length==0||nums.length==1) System.out.print(Arrays.toString(nums));
        int i=nums.length-1;
       while(i>0&&nums[i-1]>=nums[i]){
        i--;
       }
       if(i==0){
        reversenumber(nums,i,nums.length-1);
        return;
       }
       int j=nums.length-1;
       while(j>=i&&nums[j]<=nums[i-1]){
        j--;
       }
       swap(nums, i-1, j);
       reversenumber(nums, i, nums.length-1);
     
    }
    static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reversenumber(int[] nums,int i,int j){
        
        while (i<j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            j--;
            i++;
        }
    }
}
