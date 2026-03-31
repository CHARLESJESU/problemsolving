package binarysearchsolutions;
class wraparoundsolution{
    public char wraparoundanswer(char[] letters, char target){
      int ans=0;
        ans=binarysearch(letters, target);
        return letters[ans];
    }
    private int binarysearch(char[] number, int target){
        int ans=0;
        int left=0;
        int right=number.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(number[mid]<target){
                left=mid+1;
            }
            else if(number[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
                ans=left;
            }
            
        }
        return ans%number.length;
    }
}

public class wraparound {
    public static void main(String[] args) {
        wraparoundsolution s=new wraparoundsolution();
        char result=s.wraparoundanswer(new char[]{'a','f','g','h'}, 'h');
        System.out.print(result);
    }
}
