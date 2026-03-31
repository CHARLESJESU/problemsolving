package binarysearchsolutions;
import java.util.Arrays;

class firstandlastpositionsolution{
    public int[] firstandlastpositionanswer(int[] number, int target){
        int[] ans={-1,-1};
        ans[0]=binarysearch(number, target, true);
        
        ans[1]=binarysearch(number, target, false);
        return ans;
    }
    private int binarysearch(int[] number, int target, boolean firstoccurance){
        int ans=-1;
        int left=0;
        int right=number.length;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(number[mid]<target){
                left=mid+1;
            }
            else if(number[mid]>target){
                right=mid-1;
            }
            else{
                ans=mid;
                if(firstoccurance){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
        }
        return ans;
    }
}

public class firstandlastposition{
    public static void main(String[] args) {
        firstandlastpositionsolution s=new firstandlastpositionsolution();
        int[] result=s.firstandlastpositionanswer(new int[]{5,7,7,7,7,8,8,10}, 7);
        System.out.print(Arrays.toString(result));
    }
}