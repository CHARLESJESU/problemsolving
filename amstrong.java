class amstrongsolution{
    public int amstronganswer(int number){
        int answer=0;
        while(number>0){
            int digit=number%10;
            answer+= digit*digit*digit;
            number/=10;
        }
        return answer;
    }
}
public class amstrong {
    public static void main(String[] args) {
        amstrongsolution s=new amstrongsolution();
        int result=s.amstronganswer(154);
        System.out.print(result);
    }
}
