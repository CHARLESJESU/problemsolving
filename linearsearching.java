class linearsearchingsolution{
    public void linearsearching(int[] number, int target){
        for(int i=0;i<number.length;i++){
            if(target==number[i]){
                System.out.print(number[i]);
            }
        }
       
    }
}

public class linearsearching {
    public static void main(String[] args) {
        linearsearchingsolution s=new linearsearchingsolution();
     s.linearsearching(new int[]{3,5,6,3,6,7,9},5);
   
    }
}
