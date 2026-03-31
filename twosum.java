import java.util.Arrays;

public class twosum {

    public static void main(String[] args) {
          int result=twosumanswer(new int[]{2,7,11,15}, 9);
        System.out.print(result);
    }
    static int twosumanswer(int[] arr,int target){
        int sum=0;
        for(int i=0;i<arr.length-1;i++){
           for(int j=i;j<arr.length-1;j++){
            if(target!=0){
                sum=target-arr[j];
            target=sum;
            }

           }
        }
        return arr[arr.length-1];
    }
}

