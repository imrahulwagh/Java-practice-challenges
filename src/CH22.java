// 22. Create a program that shows bitwise OR of two numbers.
import java.util.Scanner;
public class CH22 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        int no1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int no2 = sc.nextInt();
        int res = no1 | no2;
        System.out.println(res);
        sc.close();
    }
}