
public class arraysortedorrotated {
    public static void main(String[] args) {
        boolean result=arraysortedorrotatedanswer(new int[]{1,2,3,4,5,6});
        System.out.print(result);
    }
    static boolean arraysortedorrotatedanswer(int[] arr){
       if(arr[0]>arr[arr.length-1]){
        return false;
       }
       else{
        return true;
       }
     
    }
}
