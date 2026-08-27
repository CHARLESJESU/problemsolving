import java.util.Arrays;

public class singlenumber {
    public static void main(String[] args) {
          int result=singlenumberanswer(new int[]{4,1,2,1,2});
        System.out.print(result);
    }
    static int singlenumberanswer(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
