package bitwiseoperation;
public class powerof2{
    public static void main(String[] args) {
        System.out.print(-4>>>1);
    }
    static boolean powerof2answer(int n){
        if(n<=0){
            return false;
        }
        return (n & (n-1))==0;
    }
}