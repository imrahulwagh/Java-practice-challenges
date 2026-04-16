// 57. Create a program to print the month of the year based on a
// number (1-12) input by the user.
import java.util.Scanner;
public class CH57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Month Generator !");
        System.out.print("Enter a Month number : ");
        int num = sc.nextInt();
        monthGenerator(num);
        sc.close();
    }
    public static void monthGenerator(int monthNumber)
    {
        String output = switch(monthNumber){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid Month Number";
        };
        System.out.println(output);
    }
}
