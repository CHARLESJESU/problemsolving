package bitwiseoperation;

public class minbittochange {
    public static void main(String[] args) {
        System.out.print(minbittochangeanswer(10, 7));
    }
    static int minbittochangeanswer(int start, int goal){
        int count=0;
        // for(int i=0;i<32;i++){// bit mostly with in 32 may be 64
        //      System.out.println(((start>>i) & 1));
        //         System.out.println(((goal>>i) & 1));
        //     if(((start>>i) & 1) != ((goal>>i)&1)){
               
        //         count++;
        //     }
        // }
        // return count;
        // int tempresult=start^goal;//1101
        // while(tempresult>0){
        //     if((tempresult&1)==1){
        //         count++;
        //     }
        //     tempresult=tempresult>>1;
        // }
        // return count;
                int tempresult=start^goal;//1101
        while(tempresult>0){
          tempresult=tempresult&(tempresult-1);
          count++;
        }
        return count;
    }
}
