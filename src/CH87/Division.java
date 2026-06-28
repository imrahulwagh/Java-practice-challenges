/*
87. Arithmetic Exception Handling
Write a program that asks the user to enter two integers and
then divides the first by the second. The program should
handle any arithmetic exceptions that may occur (like
division by zero) and display an appropriate message.
Key Points:
• Use Scanner to read user input.
• Implement a try-catch block to handle ArithmeticException.
• Display a user-friendly message if division by zero occurs.
 */
package CH87;
import java.util.Scanner;
public class Division {
    public static class NotDivideByZero extends Exception{
        public NotDivideByZero(String msg) {
            super(msg);
        }
    }
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the calculator");
        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();
        if(num2 == 0){
            try{
                throw new NotDivideByZero("Cannot divide by zero");
            }
            catch(NotDivideByZero e){
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("Result is " + num1/num2);
        }
    }
}
