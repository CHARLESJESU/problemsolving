package greedy;

public class candy {
    public static void main(String[] args){
System.out.print(totalcandy(new int[]{1,2,2}));
    }
    static int totalcandy(int[] ratings){
        int chocolatecount=0;
       int i=0;
       while(i<ratings.length){
        if(i==0){
            if(ratings[i+1]<ratings[i]){
            chocolatecount+=2;
                i++;
            continue;
    
        }
            else{
                 chocolatecount+=1;
                     i++;
            continue;
            }
        }
        if(i==ratings.length-1){
    if(ratings[i-1]<ratings[i]){
            chocolatecount+=2;
                i++;
            continue;}
            else{
                 chocolatecount+=1;
                     i++;
            continue;
            }
        }
        if(ratings[i-1]<ratings[i]&&ratings[i+1]<=ratings[i]){
            chocolatecount+=2;
                i++;
            continue;
        }
        else{
            chocolatecount+=1;
                i++;
            continue;
        }

       }
        return chocolatecount;
    }
}
