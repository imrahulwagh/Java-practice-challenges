// 7.Create a program to swap two numbers.
import java.util.Scanner;
public class CH7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 numbers to swap : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Before swapping : ");
        System.out.println("a = "+a+"\nb = "+b);
        // by using the third variable
//        int c = a;
//        a=b;
//        b=c;
        // without using the third variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping : ");
        System.out.println("a = "+a+"\nb = "+b);
        sc.close();
    }
}

