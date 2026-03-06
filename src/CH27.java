// 27. Write a program to check if a given number is even or odd using bitwise operators.
import java.util.Scanner;

public class CH27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        if((no&1)==0) {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
        sc.close();
    }
}
