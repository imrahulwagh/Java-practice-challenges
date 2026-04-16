// 55. Create a program to calculate the absolute value of a given integer.
import java.util.Scanner;
public class CH55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        int absNumber = num>0 ? num : -(num) ;
        System.out.println("Absolute value is "+absNumber);
        sc.close();
    }
}
