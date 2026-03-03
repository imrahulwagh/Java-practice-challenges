// 43. Create a program to check if the given array is sorted
import java.util.Scanner;
public class CH43 {

    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        if(isAscending(arr) || isDescending(arr)) {
            System.out.println("Array is sorted..");
        }
        else {
            System.out.println("Array is not sorted..");
        }
        ArrayUtility.sc.close();
    }
    // is array sorted in ascending manner
    public static boolean isAscending(int[] arr)
    {
        int i=1;
        while(i< arr.length)
        {
            if(arr[i]<arr[i-1])
                return false;
            i++;
        }
        return true;
    }
    // is array sorted in descending manner
    public static boolean isDescending(int[] arr)
    {
        int i=1;
        while(i< arr.length)
        {
            if(arr[i]>arr[i-1])
                return false;
            i++;
        }
        return true;
    }
}

