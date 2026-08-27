package stack;

import java.util.Arrays;
import java.util.Stack;

public class nge2 {
    public static void main(String[] args){
int[] result=nextGreaterElements(new int[]{1,2,1});
System.out.print(Arrays.toString(result));
    }
        static int[] nextGreaterElements(int[] nums) {
            
        // int[] result=new int[nums.length];
    //     Arrays.fill(result,-1);
    //    for(int i=0;i<nums.length;i++){
    //     for(int j=1;j<nums.length;j++){
    //         int index=(i+j)%nums.length;
    //         if(nums[i]<nums[index]){
    //             result[i]=nums[index];
    //             break;
    //         }
    //     }
    //    }
    //     return result;
         int[] result=new int[nums.length];
            Arrays.fill(result,-1);
             Stack<Integer> stack=new Stack<>();
      
        Arrays.fill(result,-1);
        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty()&&nums[i]>nums[stack.peek()]){
                int index=stack.pop();
                result[index]=nums[i]
;            }
            stack.push(i);
        }
        return result;}
}
