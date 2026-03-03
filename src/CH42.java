// Create a program to find the maximum and minimum element in an array.
import java.util.Scanner;
public class CH42 {
    static Scanner sc = new Scanner(System.in);
    public static void inputArray(int[] arr, int n)
    {
        System.out.print("Enter "+n+" elements : ");
        int i=0,count= 0;
        while(i<arr.length)
        {
            arr[i] = sc.nextInt();
            i++;
        }
    }
    // Maximum from Array
    public static int max(int[] arr)
    {
        int i = 0;
        int maxNumber = arr[0];
        while(i<arr.length)
        {
            if(maxNumber<arr[i])
                maxNumber = arr [i];
            i++;
        }
        return maxNumber;
    }

    // Minimum from Array
    public static int min(int[] arr)
    {
        int i = 0;
        int minNumber = arr[0];
        while(i<arr.length)
        {
            if(minNumber>arr[i])
                minNumber = arr [i];
            i++;
        }
        return minNumber;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr,n);
        System.out.println("Maximum is "+max(arr));
        System.out.println("Minimum is "+min(arr));
        sc.close();
    }
}

