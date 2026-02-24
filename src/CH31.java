// 31. Create a program that computes the sum of the digits of an integer
import java.util.Scanner;
public class CH31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int m = no;
        int sum = 0;
        while(no>0)
        {
            int rem = no%10;
            sum += rem;
            no /= 10;
        }
        System.out.println("The sum of digits in "+m+" is "+sum);
        sc.close();
    }
}
