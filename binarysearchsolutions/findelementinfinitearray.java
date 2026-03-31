package binarysearchsolutions;
class findelementinfinitearraysolution{
    public int findelementinfinitearrayanswer(int[] number, int target){
        int start=0;
        int end=1;
        
        int result=binarysearch(number,target,start,end);
        return result;
    }
        private int binarysearch(int[] number, int target,int left, int right){
      
   while(number[right]<target){
    int temp=right+1;
    right=right+(right-left+1);
    left=temp;
   }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(number[mid]<target){
                left=mid+1;
            }
            else if(number[mid]>target){
                right=mid-1;
            }
            else{
             return mid;
            }
            
        }
        return -1;
    }
}

public class findelementinfinitearray{
    public static void main(String[] args) {
        findelementinfinitearraysolution s=new findelementinfinitearraysolution();
        int result=s.findelementinfinitearrayanswer(new int[]{3,5,7,9,10,90,100,130,140,160,170}, 160);
        System.out.print(result);
    }
}