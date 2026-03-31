import binarysearchsolutions.binarysearch;

public class bullandcows {
    public static void main(String[] args) {
        System.out.print(bullandcowsanswer("1807", "7810"));
        
    }
    static String bullandcowsanswer(String secret, String guess){
        int bull=0;
        int cows=0;
        int[] numbers=new int[10];
        for(int i=0;i<secret.length();i++){
            int s=secret.charAt(i)-'0';
            int g=guess.charAt(i)-'0';

          if(s==g){
            bull++;
          }
          else{
            if(numbers[s]<0) cows++;
            if(numbers[g]>0) cows++;
            numbers[s]++;
            numbers[g]--;
          }
            
            }
            return bull + "A" + cows +"B";
    }

}
