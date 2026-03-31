package binarysearchsolutions;
class greatestfloornumbersolution{
    public int greatestfloornumberanswer(int[] number, int target){
        int ans=-1;
        ans=binarysearch(number, target, true);
        return ans;
    }
    private int binarysearch(int[] number, int target, boolean floorensure){
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
                
                if(floorensure){
                    right=mid-1;
                    ans=right;
                }
                else{
                    left=mid+1;
                    ans=left;
                }
                
            }
        }
        return ans;
    }
}

public class greatestfloornumber {
    public static void main(String[] args) {
        greatestfloornumbersolution s=new greatestfloornumbersolution();
        int result=s.greatestfloornumberanswer(new int[]{1,2,3,5,7,7,8,8,10}, 7);
        System.out.print(result);
    }
}
