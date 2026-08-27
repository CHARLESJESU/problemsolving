package stack;
import java.util.*;
public class nge1 {
    public static void main(String[] args){
int[] result=nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
System.out.print(Arrays.toString(result));
    }
     static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result=new int[nums1.length];
        Arrays.fill(result,-1);
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
            while(j<nums2.length){
                if(nums1[i]<nums2[j]){
                    result[i]=nums2[j];
                    break;
                }
                j++;
            }
        break;
        }}}
        return result;
    }
}
