public class buysellprobII {
    public static void main(String[] args) {
        System.out.print(buyandsellanswer(new int[]{7,1,5,3,6,4}));
    }
    static int buyandsellanswer(int[] prices){
        int buy=Integer.MAX_VALUE;
 
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int j=i;
            while (j+1<prices.length&&prices[j]<prices[j+1]) {
                j++;
                continue;

            }
            maxprofit+=prices[j]-prices[i];
            i=j;

        }
        return maxprofit;
    }
}
