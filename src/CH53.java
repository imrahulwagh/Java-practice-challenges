// 53. Create a program to find the minimum of two numbers.
import java.util.Scanner;
public class CH53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        int minNumber = num1 < num2 ? num1 : num2 ;
        System.out.println("Minimum number is "+minNumber);
        sc.close();
    }
}
