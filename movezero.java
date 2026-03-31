import java.util.Arrays;

public class movezero {
    public static void main(String[] args) {
        int[] result=movezeroanswer(new int[]{1,0,0,3,4,0,0,5,0,7,});
        System.out.print(Arrays.toString(result));
    }
    static int[] movezeroanswer(int[] arr){
      int j=0;
      for(int i=0;i<arr.length;i++){
       if(arr[i]!=0){
         int temp=arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
        j++;
       }
      }
      return arr;
    }
}
