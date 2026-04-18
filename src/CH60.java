// 60. Create a program using do-while to implement a number guessing game.
import java.util.Scanner;
public class CH60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the number guessing game..\n");
        int num = (int)(Math.random() * 100) + 1;
        boolean flag=false;
        do{
            System.out.print("Guess a number : ");
            int input = sc.nextInt();
            if(input==num){
                System.out.println("You won !\nYou guessed the right number..");
                flag=true;
            }else if(input>num){
                System.out.println("Smaller..");
            }else{
                System.out.println("Bigger..");
            }
        }while(!flag);
    }
}
