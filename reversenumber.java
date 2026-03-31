class reversenumberSolution{
    public int reversenumberanswer(int number){
        int answer=0;
        while(number>0){
            int n=number%10;
            answer=answer*10 + n;
            number/=10;
        }
        return answer;
    }
}

public class reversenumber{
    public static void main(String args[]){
        reversenumberSolution s=new reversenumberSolution();
        int result=s.reversenumberanswer(1234);
        System.out.print(result);
    }
}