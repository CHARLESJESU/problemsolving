public class buyandsell {
    public static void main(String[] args) {
        System.out.print(buyandsellanswer(new int[]{7,1,5,3,6,4}));
    }
    static int buyandsellanswer(int[] arr){
      int minprice=Integer.MAX_VALUE;
      int maxprofit=0;
      for(int i=0;i<arr.length;i++){
        if(arr[i]<minprice){
            minprice=arr[i];
        }
        else if(arr[i]-minprice>maxprofit){
            maxprofit=arr[i]-minprice;
        }
      }
        return maxprofit;
    }
}
