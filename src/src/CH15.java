// 15.Create a program that determines if a number is positive, negative, or zero.
import java.util.Scanner;

public class CH15
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int no = sc.nextInt();
        if(no == 0) {
            System.out.println("The number is Zero");
        }
        else if(no>0){
            System.out.println("The number is Positive");
        }
        else{
            System.out.println("The number is Negative");
        }
        sc.close();
    }
}
