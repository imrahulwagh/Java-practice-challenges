// 29. Create a program to sum all odd numbers from 1 to a specified number N.
import java.util.Scanner;
public class CH29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int i=1;
        int sum = 0;
        while(i<=no)
        {
            sum = sum+i;
            i += 2;
        }
        System.out.println("The sum of odd digits up to "+no+" is "+sum);
        sc.close();
    }

}
