import java.util.ArrayList;
import java.util.HashSet;

public class happynumber {
    public static void main(String[] args) {
        System.out.print(happynumberanswer(20,new HashSet<>()));
    }
    // static boolean happynumberanswer(int number){
    //     ArrayList<Integer> temp=new ArrayList<>();
    //     int result=0;
    //     while(number>0){
            
         
    //         int digit=number%10;
    //         result+=digit*digit;
    //         number/=10;
    //         if(number==0){
    //                if(result==1){
    //             return true;
    //         }
    //         else if(temp.contains(result)){
    //             return false;
    //         }
    //         temp.add(result);
    //             number=result;
    //             System.out.println(number);
    //             result=0;
    //         }
    //     }
    //     return false;
    // }
    static boolean happynumberanswer(int number, HashSet<Integer> seen){
        ArrayList<Integer> temp=new ArrayList<>();
        if(number==1){
            return true;
        }
        if(seen.contains(number)){return false;}
seen.add(number);
        int result=0;
        while(number>0){
                        int digit=number%10;
            result+=digit*digit;
            number/=10;
        }

        
        return happynumberanswer(result,seen);
    }
}
