// 37. Create a program to check if a number is an Armstrong number.
import java.util.Scanner;
public class CH37 {
    public static int armStrong(int n)
    {
        int rem, sum=0;
        while(n>0)
        {
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        if(no==armStrong(no))
        {
            System.out.println("The number is Armstrong..");
        }
        else {
            System.out.println("The number is not Armstrong..");
        }
        sc.close();
    }
}
