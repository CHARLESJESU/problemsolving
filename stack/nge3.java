package stack;
public class nge3{
    public static void main(String[] args){
System.out.print(nextGreaterElement(534976));
    }
      static int nextGreaterElement(int n) {
        int min=Integer.MAX_VALUE;
     char[] s=Integer.toString(n).toCharArray();
     int breakpoint=s.length-2;
     for(int i=s.length-2;i>=0;i--)
     {
        if(s[i]>=s[i+1]){
            breakpoint--;
            continue;
        }
        else{
            break;
        }

     }
     if(breakpoint<0){
        return -1;
     }
     char nextgreatest=s[breakpoint+1];
     int index=breakpoint+1;
     for(int i=breakpoint+1;i<s.length;i++){
       if(s[breakpoint]<s[i]&&s[i]<nextgreatest){
nextgreatest=s[i];
index=i;
       }

     }
     System.out.println(breakpoint);
     System.out.println(nextgreatest);
     System.out.println(index);
     
     char temp=s[breakpoint];
     s[breakpoint]=s[index];
     s[index]=temp;
     int result=0;
     breakpoint+=1;
    while(breakpoint<index){
           temp=s[breakpoint];
     s[breakpoint]=s[index];
     s[index]=temp;
     index--;
     breakpoint++;
    }
     for(char a: s){
        int number=a-'0';
        result=number+result*10;
     }
     return result;
    }
}