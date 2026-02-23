// 5.Create a program to input name of the person and respond with ”Welcome NAME to KG Coding”
import java.util.Scanner;

public class CH5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.next();
        System.out.println("Welcome "+name+" to KG Coding");
        sc.close();
    }
}
