// 41. Create a program to find number of occurrences of an element in an array.
import java.util.Scanner;

public class CH41 {
    public static int occurrenceInArray(int[] arr, int key)
    {
        int i=0,count=0;
        while(i<arr.length)
        {
            if(arr[i]==key)
            {
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter a number for occurrence check : ");
        int key = sc.nextInt();
        System.out.println("Occurrence of "+key+" is "+ occurrenceInArray(arr,key));
        sc.close();
    }
}

