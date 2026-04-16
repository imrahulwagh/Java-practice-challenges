// 58. Create a program to create a simple calculator that uses a
//switch statement to perform basic arithmetic operations
//like addition, subtraction, multiplication, and division.
import java.util.Scanner;
public class CH58 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("---- Welcome to the calculator ! ----\n");
        System.out.print("Enter first number : ");
        int first = sc.nextInt();
        System.out.print("Enter second number : ");
        int second = sc.nextInt();
        System.out.println("What operation do you want to perform :");
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.print("Enter a number : ");
        int ch = sc.nextInt();
        switch(ch) {
            case 1 :
                System.out.println("Addition is "+(first+second));
                break;
            case 2 :
                System.out.println("Substraction is "+(first-second));
                break;
            case 3 :
                System.out.println("Multiplication is "+(first*second));
                break;
            case 4 :
                System.out.println("Division is "+(first/second));
                break;
            case 5 :
                System.out.println("Modulus is "+(first%second));
                break;
        }
    }
}
