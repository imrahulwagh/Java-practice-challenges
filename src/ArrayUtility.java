import java.util.Scanner;
class ArrayUtility {
    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter element no."+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void displayArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
