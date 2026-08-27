package stack;
import java.util.*;
public class nge {
    public static void main(String[] args){
        int[] result=ngeanswer(new int[]{4,5,7,6,2,10});
System.out.print(Arrays.toString(result));
    }
    static int[] ngeanswer(int[] a){
        Stack<Integer> stack=new Stack<>();
        int[] result=new int[a.length];
        Arrays.fill(result,-1);
        for(int i=0;i<a.length;i++){
            while(!stack.isEmpty()&&a[i]>a[stack.peek()]){
                int index=stack.pop();
                result[index]=a[i]
;            }
            stack.push(i);
        }
        return result;
    }
}
