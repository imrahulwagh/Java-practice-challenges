// 58. Create a program to create a simple calculator that uses a
//switch statement to perform basic arithmetic operations
//like addition, subtraction, multiplication, and division.
import java.util.Scanner;
public class CH58 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("---- Welcome to the calculator ! ----");
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        System.out.println("What operation do you want to perform :");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter a number : ");
        int ch = sc.nextInt();

        int res = switch(ch){
            case 1 -> num1 + num2 ;
            case 2 -> num1 - num2 ;
            case 3 -> num1 * num2 ;
            case 4 -> num1 / num2 ;
            case 5 -> num1 % num2 ;
            default -> -1 ;
        };
        System.out.println("The result is "+res);
    }
}
