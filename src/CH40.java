// 40. Create a program to find the sum and average of all elements in an array.
import java.util.Scanner;
public class CH40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        int i=0,sum=0;
        while(i<arr.length)
        {
            arr[i] = sc.nextInt();
            sum += arr[i];
            i++;
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+(float)sum/n);
        sc.close();
    }
}
