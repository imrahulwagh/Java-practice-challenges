// 61. Create a program using for loop multiplication table for a number.
import java.util.Scanner;
public class CH61 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to the Multiplication Table Generator !");
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println();
        for(int i=1;i<=10;i++) {
            System.out.println(num+" x "+i+" = "+num*i);
        }
        sc.close();
    }
}
