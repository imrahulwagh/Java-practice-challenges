// 41. Create a program to find number of occurrences of an element in an array.
import java.util.Scanner;

public class CH41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+n+" elements : ");
        int i=0,count= 0;
        while(i<arr.length)
        {
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.print("Enter a number for occurrence check : ");
        int occ_no = sc.nextInt();
        int j = 0;
        while(j<arr.length)
        {
            if(arr[j] == occ_no)
            {
                count++;
            }
            j++;
        }
        System.out.println("Occurrence of "+occ_no+" is "+count);
        sc.close();
    }
}

