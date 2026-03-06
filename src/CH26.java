// 26. Create a program that shows use of right shift operator.
import java.util.Scanner;

public class CH26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int res = no>>1;
        System.out.println(res);
        sc.close();
    }
}
