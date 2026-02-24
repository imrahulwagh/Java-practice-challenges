// 28. Develop a program that prints the multiplication table for a given number.
import java.util.Scanner;

public class CH28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        System.out.println("Table of "+no);
        int i=1;
        while(i<=10)
        {
            System.out.println(no+" X "+i+" = "+no*i);
            i++;
        }
        sc.close();
    }
}
