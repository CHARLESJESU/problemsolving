import java.util.Stack;

public class removeouterparanthesis{
    public static void main(String[] args) {
        System.out.print(removeouteranswer("(()())(())"));
    }
    static String removeouteranswer(String s){
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')')
                {
                if(st.size()>1){
                    sb.append(s.charAt(i));
                }
                st.pop();
            }
            else{
                if(!st.empty()){
                    sb.append(s.charAt(i));
                }
                st.push(s.charAt(i));
            }
        }
        return sb.toString();
    }
}