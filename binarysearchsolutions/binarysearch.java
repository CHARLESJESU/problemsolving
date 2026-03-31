package binarysearchsolutions;
class binarysearchsolution{
    public void binarysearchanswer(int[] number, int target){
        if(number.length<=1){System.out.print(number[0]);
        }
        int left=0,right=number.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(number[mid]<target){
                left=mid+1;
            }
            else if(number[mid]>target){
                right=mid-1;
            }
            else if(number[mid]==target){
                System.out.print(number[mid]);
                break;
            }
            else{
                System.out.print(-1);
            }
        }
    }
}

public class binarysearch {
    public static void main(String[] args) {
        binarysearchsolution s=new binarysearchsolution();
        s.binarysearchanswer(new int[]{1,2,3,4,5,6,7,8}, 5);
    }
}
