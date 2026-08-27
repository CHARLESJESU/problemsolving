package stack;
import java.util.*;
public class largerectangle {
    public static void main(String[] args){

    }
    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        
        for(int i=0;i<heights.length;i++){
            int currheight=heights[i];
            while(!stack.isEmpty()&&currheight<heights[stack.peek()]){
                int h=heights[stack.pop()];
                int width=stack.isEmpty()?i:i-stack.peek()-1;
                maxarea=Math.max(maxarea,h*width);
            }
            stack.push(i);
        }
        return maxarea;
    }
}
