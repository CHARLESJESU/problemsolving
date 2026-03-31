public class learning{
    public static void main(String[] args) {
       factorial();
    }
 static void factorial() {
    factorial1();
       System.out.print("function 1 called");
    }
     static void factorial1() {
    factorial2();
       System.out.print("function 1 called");
    }
 static void factorial2() {
    factorial3();
       System.out.print("function 2 called");
    }
     static void factorial3() {
    factorial4();
       System.out.print("function 3 called");
    }
     static void factorial4() {
       System.out.print("function 4 called");
    }
    }

