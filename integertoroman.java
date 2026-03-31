public class integertoroman{
    public static void main(String[] args) {
        
    }
    static String integertoromananswer(int number){
          final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        final String[] symbols = {"M", "CM", "D",  "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            if(number==0){
                break;
            }
            while (number>=values[i]) {
                sb.append(symbols[i]);
                number-=values[i];

            }


        }
        return sb.toString();
        
    }
    static char getvalue(int number){
        switch (number) {
            case 1:
              return 'I';
                      case 5:
              return 'V';
                      case 10:
              return 'X';
                      case 50:
              return 'L';
                      case 100:
              return 'C';
                      case 500:
              return 'D';
                      case 1000:
              return 'M';

            default:
               return 'I';
        }
    }
}