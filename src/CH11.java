//11.Create a program to calculate the Area of a Triangle.
//Area of triangle = ½*B*H
import java.util.Scanner;
import java.io.*;
public class CH11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base in cms : ");
        double base  = sc.nextDouble();
        System.out.print("Enter the height in cms : ");
        double height  = sc.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("The area of triangle is "+area);
        sc.close();
    }
}
