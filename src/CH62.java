// 62. Create a program using for to display if a number is prime or not.
import java.util.Scanner;
public class CH62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Prime number checker..");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("Your number is "+(isPrime(num) ? "prime" : "not prime"));
        sc.close();
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
