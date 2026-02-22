// 16.Create a program that determines if a number is odd or even.
import java.util.Scanner;
public class CH16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int no = sc.nextInt();
        if (no % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }
        sc.close();
    }
}
