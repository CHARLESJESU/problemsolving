class gcdandlcmsolution{
    public void gcdandlcm(int number1,int number2){
        int gcd=0;
        int max1;
        int max2;
        if(number1>number2){
            max1=number1;
            max2=number2;
        }
        else{
            max1=number2;
            max2=number1;
        }
      while(max2!=0){
        int temp=max2;
        max2=max1%max2;
        max1=temp;
      }
      gcd=max1;
        int lcm=(number1*number2)/gcd;
        System.out.println(gcd);
                System.out.print(lcm);

    }
    
}

public class gcdandlcm {
    public static void main(String[] args) {
        gcdandlcmsolution s=new gcdandlcmsolution();
        s.gcdandlcm(12, 18);
    }
}
