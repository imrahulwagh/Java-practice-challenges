// 9. Create a program to calculate product of two floating points numbers.
import java.util.Scanner;
public class CH9
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating numbers : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The product of "+a+" and "+b+" is "+(a*b));
        sc.close();
    }
}