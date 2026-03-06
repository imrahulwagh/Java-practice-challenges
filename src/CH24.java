// 24. Create a program that shows bitwise compliment of a number.
import java.util.Scanner;

public class CH24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int res = ~no;
        System.out.println("Compliment of "+no+" is "+res);
        sc.close();
    }
}
