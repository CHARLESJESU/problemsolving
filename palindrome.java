
class palindromeSolution{
    public String palindromeanswer(String word){
        String answer="";
        for(int i=word.length()-1;i>=0;i--){
            answer+=word.charAt(i);
        }
        return answer;
    }
}

public class palindrome {
    public static void main(String[] args) {
        palindromeSolution s=new palindromeSolution();
        String result=s.palindromeanswer("appa");
        System.out.print(result);

    }
}
