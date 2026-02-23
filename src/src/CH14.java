//14.Create a program to convert Fahrenheit to Celsius
// °C = (°F - 32) × 5/9
import java.util.Scanner;

public class CH14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        float fh = sc.nextFloat();
        float cel = (fh - 32) * 5.0f/9.0f;
        System.out.println("The "+fh+"F is "+cel+"C");
        sc.close();
    }
}
