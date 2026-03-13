// 9. Create a program to calculate product of two floating points numbers.
import java.util.Scanner;
public class CH9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first floating number : ");
        double a = sc.nextDouble();
        System.out.print("Enter second floating number : ");
        double b = sc.nextDouble();
        System.out.println("The multiplication of "+a+" and "+b+" is "+(a*b));
        sc.close();
    }
}
