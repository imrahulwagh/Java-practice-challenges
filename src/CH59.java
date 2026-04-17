// 59. Create a program using do-while to find password checker until a valid password is entered.
import java.util.Scanner;
public class CH59 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int pass = 1234;
        boolean flag = false;
        int maxLimit = 3;
        System.out.println("|| Welcome to our application ||");
        do{
            System.out.print("\nEnter a password : ");
            int input = sc.nextInt();
            if(input == pass){
                System.out.println("Login Successful..");
                flag = true;
            }
            else {
                System.out.println("Password incorrect..");
                maxLimit--;
                if(maxLimit==0) {
                    System.out.println("Your limit has been reached..");
                    continue;
                }
                System.out.println("You have only "+maxLimit+" attempt remaining..");
            }
        }while(!flag && maxLimit>0);
    }
}

