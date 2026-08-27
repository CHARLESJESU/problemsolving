// Java

import java.util.Arrays;
import java.util.Scanner;

class summa{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int[][] w={{1,2,3},{2,3,4},{2,3,4}};
        int y=w[0][0];
        y=20;
        System.out.print(Arrays.deepToString(w));
        System.out.print("Enter text: ");
        String text = scanner.nextLine(); // Reads string
                int easy=95;
        int busy=easy;
        busy=100;
        System.out.println(easy);
        System.out.print("Enter integer: ");
        int number = scanner.nextInt(); 
        scanner.nextLine();
        System.out.print("Enter summa: ");  // Reads int natively
        String summa = scanner.nextLine();
                System.out.print("Enter floatter: ");  // Reads int natively
        float floatter = scanner.nextFloat();

        double s=9.0;
        float a=9.0f;
        scanner.close();

        System.out.printf("text is : %s | number is %d | number is %s | floatter is %.8f | double %.8f", text,number,summa,floatter,s);
}


}