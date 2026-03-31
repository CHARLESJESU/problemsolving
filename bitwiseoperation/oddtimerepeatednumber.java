package bitwiseoperation;

public class oddtimerepeatednumber {
    public static void main(String[] args) {
        System.out.print(oddtimerepeatednumberanswer(new int[]{2,3,4,5,3,2,4}));
    }
    static int oddtimerepeatednumberanswer(int[] arr){
        int result=0;
        for(int a: arr){
            result=result^a;
        }
        return result;
    }
}
