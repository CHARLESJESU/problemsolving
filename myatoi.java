import java.util.ArrayList;

public class myatoi {
    public static void main(String[] args) {
        System.out.print(myatoianswer("1337c0d3"));
    }
    static int myatoianswer(String s){
       int i=0;
       while(i<s.length() && s.charAt(i)==' '){
        i++;
       }
       if(i==s.length()){
        return 0;
       }
       int sign=1;
       if(s.charAt(i)=='+'){
        i++;
       }
       if(s.charAt(i)=='-'){
        sign=-1;
        i++;
       }
       long res=0;
       while(i<s.length() && Character.isDigit(s.charAt(i))){
        int digit=s.charAt(i)-'0';
        res=res*10+digit;
               if(sign*res>=Integer.MAX_VALUE){
        return Integer.MAX_VALUE;
       }
       if(sign*res<=Integer.MIN_VALUE){
        return Integer.MIN_VALUE;
       }
        i++;
       }



       return (int)(sign*res);
    }
}
