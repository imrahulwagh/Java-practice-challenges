// 13.Create a program to calculate Compound interest.
// A=P(1+R/100)^T
// CI=A−P
import java.util.Scanner;

public class CH13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle amount Rs");
        int P = sc.nextInt();
        System.out.print("Enter the Time in years : ");
        float t = sc.nextFloat();
        System.out.print("Enter the Rate of Interest in percentage : ");
        float r = sc.nextFloat();
        double A = P * Math.pow(1+(r/100),t);
        double ci = A - P;
        System.out.println("The compound interest is "+ci);
        sc.close();
    }

}
