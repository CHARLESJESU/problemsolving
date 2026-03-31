import java.util.Arrays;

public class removeduplicatesortedarray {
    public static void main(String[] args) {
              int[] result=removeduplicatesortedarrayanswer(new int[]{1,2,2,3,4,4,5,6});
        System.out.print(Arrays.toString(result));
    }
    static int[] removeduplicatesortedarrayanswer(int[] arr){
        int j=0;
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        while(j+1<arr.length){
            arr[j+1]=0;
            j++;
        }
        return arr;
    }
}
