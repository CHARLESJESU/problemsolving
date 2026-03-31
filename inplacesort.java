import java.util.Arrays;

public class inplacesort {
    public static void main(String[] args) {
        int[] result=dudgenationalflaganswer(new int[]{0,1,0,1,2});
        System.out.print(Arrays.toString(result));
    }
    static int[] dudgenationalflaganswer(int[] arr){
        int low=0,mid=0,hig=arr.length-1;
        while (mid<=hig) {
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                int temp=arr[hig];
                arr[hig]=arr[mid];
                arr[mid]=temp;
                hig--;
            }
        }
        return arr;
    }
}
