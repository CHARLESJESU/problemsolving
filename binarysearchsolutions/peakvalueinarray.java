package binarysearchsolutions;
class peakvalueinarraysolution{
    public int peakvalueinarrayanswer(int[] number){
        int result=binarysearch(number);
        return result;
    }
           private int binarysearch(int[] number){
      int left=0;
      int right=number.length-1;

        while(left<right){
            int mid=left+(right-left)/2;
            if(number[mid]>number[mid+1]){
                right=mid;
               
            }
            else {
                 left=mid+1;
            }
            
        }
      return left;
    }
}

public class peakvalueinarray {
    public static void main(String[] args) {
        peakvalueinarraysolution s=new peakvalueinarraysolution();
        int result=s.peakvalueinarrayanswer(new int[]{0,1,2,4,2,1});
        System.out.print(result);
    }
}
