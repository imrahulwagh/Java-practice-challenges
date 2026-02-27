// 36. Create a program to print the Fibonacci series up to a certain number.
import java.util.Scanner;
public class CH36 {
    public static void fib(int n)
    {
        int first = 0,second = 1,i=3,temp;
        System.out.print(first+" "+second+" ");
        while(i<=n)
        {
            temp = first + second;
            System.out.print(temp+" ");
            first = second;
            second = temp;
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        System.out.print("Fibonacci Series : ");
        fib(no);
        sc.close();
    }
}
