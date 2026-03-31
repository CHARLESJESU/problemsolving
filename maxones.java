public class maxones {
    public static void main(String[] args) {
        int result=maxonesanswer(new int[]{1,1,1,5,3,1,1,1,1,3,4,1,1,1,1,1});
        System.out.print(result);
    }
    static int maxonesanswer(int[] arr){
        int count=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]==1){
                count++;
                if(max<count){
max=count;
                }
            }
            else{
                
                
                count=0;
            }
            
        }
        return max;
    }
}
