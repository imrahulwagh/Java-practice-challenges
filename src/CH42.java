// Create a program to find the maximum and minimum element in an array.
import java.util.Scanner;
public class CH42 {
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
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Maximum is "+max(arr));
        System.out.println("Minimum is "+min(arr));
        ArrayUtility.sc.close();
    }
}

