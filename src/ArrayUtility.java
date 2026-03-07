import java.util.Scanner;
class ArrayUtility {
    static Scanner sc = new Scanner(System.in);
    public static int[] inputArray(){
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
    public static int[][] input2DArray(){
        System.out.print("Enter no. of rows : ");
        int row = sc.nextInt();
        System.out.print("Enter no. of columns : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter "+(row+col)+" elements : ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }
    public static void displayArray(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
