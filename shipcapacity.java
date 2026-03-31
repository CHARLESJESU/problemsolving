public class shipcapacity{
    public static void main(String[] args){
System.out.print(shipWithinDays(new int[]{3,2,2,4,1,4}, 3));
    }
    // weights = [1,2,3,4,5,6,7,8,9,10], days = 5
    static int shipWithinDays(int[] weights, int days) {
        int max=Integer.MIN_VALUE;
        int totalweight=0;
       for(int weight: weights){
        max=Math.max(weight,max);
        totalweight+=weight;
       }

       while(max<totalweight){
        int mid=max+(totalweight-max)/2;
        int currcap=0;
        int day=1;
        for(int weight: weights){
            if(currcap+weight>mid){
                day++;
                currcap=0;
            }
            currcap+=weight;
        }
        if(day>days){
            max=mid+1;
        }
        else{
            totalweight=mid;
        }
       }
       return max;
    }
}