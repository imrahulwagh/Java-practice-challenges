// 54. Create a program to find if the given number is even or odd.
import java.util.Scanner;
public class CH54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String oddEven = (num%2==0) ? "Even" : "Odd" ;
        System.out.println("Number is "+oddEven);
        sc.close();
    }
}
