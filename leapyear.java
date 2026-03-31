class leapyearsolution{
    public boolean leapyearanswer(int year){
        if(year%400==0){
            return true;
        }
        else if(year%100==0){
            return false;
        }
        else if(year%4==0){
            return true;
        }
        else{
            return false;
        }
    }
}

public class leapyear {
    public static void main(String[] args) {
        leapyearsolution s=new leapyearsolution();
        System.out.print(s.leapyearanswer(2020));
    }
}
