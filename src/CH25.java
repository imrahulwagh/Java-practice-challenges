// 25. Create a program that shows use of left shift operator.
import java.util.Scanner;

public class CH25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int no = sc.nextInt();
        int res = no<<1;
        System.out.println(res);
        sc.close();
    }
}
