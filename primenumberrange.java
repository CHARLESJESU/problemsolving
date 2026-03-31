import java.util.ArrayList;
import java.util.List;

class primenumberrangesolution{
    public List<Integer> primenumberanswer(int number){
  List<Integer> result=new ArrayList<>();
        if(number<=1){return result;}
      result.add(2);
      
        for(int i=3;i<number;i+=2){
            for(int j=0;j<result.size();j++){
            if(i%result.get(j)==0){
                break;
            }
        }
    result.add(i);}
        return result;
    }
}

public class primenumberrange {
    public static void main(String[] args) {
        primenumberrangesolution s=new primenumberrangesolution();
        List<Integer> result=s.primenumberanswer(15);
        System.out.print(result.toString());
    }
}
