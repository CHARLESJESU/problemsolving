class perfectnumbersolution{
    public int perfectnumberanswer(int number){
        int answer=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}

public class perfectnumber {
    public static void main(String[] args) {
        perfectnumbersolution s=new perfectnumbersolution();
        int result = s.perfectnumberanswer(4);
        System.out.print(result);;
    }
}
