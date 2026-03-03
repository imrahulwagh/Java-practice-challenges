// 43. Create a program to check if the given array is sorted
import java.util.Scanner;
public class CH43 {
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
    // is array sorted
    public static boolean isSorted(int[] arr)
    {
        int i = 0;
        while(i<arr.length-1)
        {
            if(arr[i]>arr[i+1])
                return false;
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Enter a array size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        inputArray(arr,n);
        if(isSorted(arr)) {
            System.out.println("Array is sorted..");
        }
        else {
            System.out.println("Array is not sorted..");
        }
        sc.close();
    }
}

