
class fibonaciseriessolution{
    public int fibonaciseriesanswer(int number){
        if(number>=0){
        if(number==0||number==1){
            return 1;
        }
        else{
            return number*fibonaciseriesanswer(number-1);
        }}
        else{
            return 0;
        }
       
    }
}
public class fibonaciseries {
    public static void main(String[] args) {
        fibonaciseriessolution s=new fibonaciseriessolution();
        int result=s.fibonaciseriesanswer(-5);
        System.out.print(result);
    }
}
