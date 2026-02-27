// 34. Create a program to check whether a given number is prime.
import java.util.Scanner;
public class CH34 {
    public static boolean isPrime(int no)
    {
        if(no<=1)
            return false;
        else {
            int i=2;
            while(i<no)
            {
                if(no%i==0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        if(isPrime(no)){
            System.out.println("The number is prime..");
        }
        else {
            System.out.println("The number is not prime..");
        }
        sc.close();
    }
}
