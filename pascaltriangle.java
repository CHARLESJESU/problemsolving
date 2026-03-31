import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class pascaltrianglesolution{
    public void pascaltriangleanswer(int number){
        int[][] result=new int[number][number];
        for(int i=0;i<number;i++){
            for(int j=0;j<=i;j++){
                if(j!=0&&j!=i){
                    result[i][j]=result[i-1][j-1]+result[i-1][j];
                }
                else{
                    result[i][j]=1;
                }
            }
        }
        for(int[] element:result){
            System.out.print(Arrays.toString(element));
        }
    }
}

public class pascaltriangle {
    public static void main(String[] args) {
        pascaltrianglesolution s=new pascaltrianglesolution();
        s.pascaltriangleanswer(8);
    }
}
