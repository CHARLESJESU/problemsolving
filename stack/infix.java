package stack;

import java.util.Stack;

public class infix {
    public static void main(String[] args) {
        System.out.print(infixanswer("A+B*C"));
    }
    static int precedence(char s){
        if(s=='^') return 3;
        else if(s=='*'||s=='/') return 2;
        else return 1;
    }
    static String infixanswer(String a){
        Stack<Character> stack=new Stack<>();
        StringBuilder result=new StringBuilder();
        for(char s:a.toCharArray()){
            if(Character.isLetterOrDigit(s)){
                result.append(s);
            }
            else if(s=='('){
                stack.push(s);
            }
            else if(s==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop());
                }
            }
            else{
                while(!stack.isEmpty() && precedence(s)<=precedence(stack.peek())){
                    result.append(stack.pop());
                }
              stack.push(s);
            }
         
        }
           while(!stack.isEmpty()){
                result.append(stack.pop());
            }
        return result.toString();
    }
}
