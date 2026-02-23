// 12.Create a program to calculate simple interest.
// Simple Interest = (P x T x R)/100
import java.util.Scanner;

public class CH12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount Rs");
        int p = sc.nextInt();
        System.out.print("Enter the Time in years : ");
        float t = sc.nextFloat();
        System.out.print("Enter the Rate of Interest in percentage : ");
        float r = sc.nextFloat();
        double si = (p*t*r)/100;
        System.out.print("\nThe Simple Interest is "+si);
        sc.close();
    }
}
