import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class primenumberrangesolution{
//     public List<Integer> primenumberanswer(int number){
//   List<Integer> result=new ArrayList<>();
//         if(number<=1){return result;}
//       result.add(2);
      
//         for(int i=3;i*i<number;i+=2){
//             for(int j=0;j<result.size();j+=i){
//             if(i%result.get(j)==0){
//                 break;
//             }
//         }
//     result.add(i);}
//         return result;
//     }
        public List<Integer> primenumberanswer(int number){
boolean[] result=new boolean[number+1];
Arrays.fill(result, false);

for(int i=2;i*i<number;i++){
    if(!result[i]){
        for(int j=i+i;j<number;j+=i){
            result[j]=true;
        }
    }
}
for(int i=2;i<number;i++){
    if(!result[i]){
        System.out.println(i);
    }
}
return new ArrayList<>();
   
    }
}

public class primenumberrange {
    public static void main(String[] args) {
        primenumberrangesolution s=new primenumberrangesolution();
        List<Integer> result=s.primenumberanswer(15);
        System.out.print(result.toString());
    }
}
