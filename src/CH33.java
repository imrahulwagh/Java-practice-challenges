// 32. Create a program to find the Greatest Common Divisor (GCD) of two numbers.
import java.util.Scanner;
public class CH33
{
    public static int gcd(int a,int b)
    {
        while(b!=0)
        {
            int r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number : ");
        int x = sc.nextInt();
        System.out.print("Enter second number : ");
        int y = sc.nextInt();
        System.out.println("The LCM of "+x+" and "+y+" is "+gcd(x,y));
        sc.close();
    }
}
