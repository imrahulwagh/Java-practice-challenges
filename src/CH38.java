// 38. Create a program to verify if a number is a palindrome.
import java.util.Scanner;
public class CH38 {
    public static int reverse(int n)
    {
        int rem, rev=0;
        while(n>0)
        {
            rem = n%10;
            rev = (rev*10)+rem;
            n /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        if(no == reverse(no)) {
            System.out.println("The number is palindrome");
        }
        else{
            System.out.println("The number is not palindrome");
        }
        sc.close();
    }
}
