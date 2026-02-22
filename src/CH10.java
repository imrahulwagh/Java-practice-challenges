//10.Create a program to calculate Perimeter of a rectangle.
//Perimeter of rectangle ABCD = A+B+C+D
import java.util.Scanner;
public class CH10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 sides of rectangle in cms : ");
        double a  = sc.nextDouble();
        double b  = sc.nextDouble();
        double c  = sc.nextDouble();
        double d  = sc.nextDouble();

        System.out.println("The perimeter is "+(a+b+c+d)+"cm");

        sc.close();

    }
}