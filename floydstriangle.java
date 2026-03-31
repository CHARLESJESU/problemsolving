class floydstrianglesolution{
    public void floydstriangleanswer(int number){
        int k=1;
        for(int i=1;i<number;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
}

public class floydstriangle {
    public static void main(String[] args) {
        floydstrianglesolution s=new floydstrianglesolution();
        s.floydstriangleanswer(5);
    }
}
