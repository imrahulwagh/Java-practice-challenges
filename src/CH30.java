// 30. Write a function that calculates the factorial of a given number.
import java.util.Scanner;
public class CH30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int temp = no;
        int fact = 1;
        while(no>0)
        {
            fact *=no;
            no--;
        }
        System.out.println("The factorial of "+temp+" is "+fact);
        sc.close();
    }
}
