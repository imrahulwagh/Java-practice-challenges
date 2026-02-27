//35. Create a program to reverse the digits of a number.
import java.util.Scanner;
public class CH35 {
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
        System.out.println("The rev of "+ no +" is "+reverse(no));
        sc.close();
    }
}
