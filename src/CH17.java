// 17. Create a program that determines the greatest of the three numbers
import java.util.Scanner;
public class CH17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the third number : ");
        int c = sc.nextInt();
        if(a>b && a>c){
            System.out.println("The number "+a+" is greater..");
        }
        else if(b>a && b>c){
            System.out.println("The number "+b+" is greater..");
        }
        else{
            System.out.println("The number "+c+" is greater..");
        }
        sc.close();
    }
}
