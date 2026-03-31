class primenumbersolution{
    public boolean primenumberanswer(int number){
        if(number<=1){return false;}
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}

public class primenumber {
    public static void main(String[] args) {
        primenumbersolution s=new primenumbersolution();
        boolean result=s.primenumberanswer(11);
        System.out.print(result);
    }
}
