public class power {
    public static void main(String[] args) {
        System.out.print(power(5, 5));
    }
    static long power(int base, int pow){
       
        if(pow==0){
            return 1;
        }
        long half=power(base,pow/2);
        if(pow%2==0){
            return half*half;
        }
        else{
            return base*half*half;
        }
    }
}
