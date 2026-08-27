import java.util.*;

public class subsequenceelement {
    public static void main(String[] args) {
        subsequenceelementanswer("abc");
    }
    static void subsequenceelementanswer(String a){
        List<String> result = new ArrayList<>();
        
        result.add("");
        for(int i=0;i<a.length();i++){

            String currentchar=String.valueOf(a.charAt(i));
            int currentresultlength=result.size();
           for(int j=0;j<currentresultlength;j++){
            result.add(result.get(j)+currentchar);
           }
        }
    
    for(String answer:result){  
        System.out.print(answer+' ');
    }}
}
