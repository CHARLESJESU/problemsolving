import java.util.Arrays;

class matrixrotationsolution{
    public void matrixrotationanswer(int[][] matrix){
        int[][] result=new int[matrix.length][matrix[0].length];
        //clockwise
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){
        //         result[j][matrix[0].length-1-i]=matrix[i][j];
        //     }
        // }
//         [
//   [1, 2, 3],
//   [4, 5, 6],
//   [7, 8, 9]
// ]
//         [
//   [3, 6, 9],
//   [2, 5, 8],
//   [1, 4, 7]
// ]
        // anticlockwise
            for(int i=0;i<matrix.length;i++){
             for(int j=0;j<matrix[0].length;j++){
                result[matrix[0].length-1-j][i]=matrix[i][j];
            }
        }
        for(int[] temp: result){
            System.out.println(Arrays.toString(temp));
        }
    }
}

public class matrixrotation {
    public static void main(String[] args) {
        matrixrotationsolution s=new matrixrotationsolution();
        s.matrixrotationanswer(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
    }
}
