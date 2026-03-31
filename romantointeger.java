public class romantointeger {
    public static void main(String[] args) {
        System.out.print(romantointegeranswer("IL"));
    }
    static int romantointegeranswer(String s){
        int total=0;
        int pretotal=0;
        for(int i=s.length()-1;i>=0;i--){
            int currvalue=getvalue(s.charAt(i));
            if(currvalue<pretotal){
                total-=currvalue;
                pretotal=currvalue;
            }
            else{
                total+=currvalue;
                pretotal=currvalue;
            }
        }
        return total;
    }
    static int getvalue(char s){
        switch (s) {
            case 'I':
                return 1;
                case 'V':
                return 5;
                case 'X':
                return 10;
                case 'L':
                return 50;
                case 'C':
                return 100;
                case 'D':
                return 500;
                case 'M':
                return 1000;
         
        
            default:
                return 0;
        }
    }
}
