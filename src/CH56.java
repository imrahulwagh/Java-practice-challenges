// 56. Create a program to Based on a student's score, categorize as
//"High", "Moderate", or "Low" using the ternary operator
import java.util.Scanner;
public class CH56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Student Score : ");
        int score = sc.nextInt();
        String category = score>80 ? "High" : (score>50 ? "Moderate" : "Low");
        System.out.println("Category is "+category);
        sc.close();
    }
}
