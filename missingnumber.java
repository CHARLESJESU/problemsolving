public class missingnumber {
    public static void main(String[] args) {
        int result=missingnumberanswer(new int[]{1,3});
        System.out.print(result);
    }
    static int missingnumberanswer(int[] nums) {
    int n = nums.length;
    // Expected sum of numbers from 0 to n
    int expectedSum = n * (n + 1) / 2;
    
    int actualSum = 0;
    for (int num : nums) {
        actualSum += num;
    }   
    
    return expectedSum - actualSum;
}
}
