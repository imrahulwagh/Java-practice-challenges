// 50. Create a program to find the sum of two diagonal elements (row and columns should be same )
public class CH50 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of diagonal elements in 2D array ");
        int [][] arr = ArrayUtility.input2DArray();
        int sum = diagonalSum(arr);
        System.out.println("\nSum of diagonal elements is "+sum);
        ArrayUtility.sc.close();
    }
    public static int diagonalSum(int[][] arr) {
        int sum = 0,i=0;
        System.out.print("Diagonal elements are : ");
        while(i < arr.length){
            int j=0;
            while(j<arr[i].length) {
                if(i==j) {
                    System.out.print(arr[i][j]+" ");
                    sum += arr[i][j];
                }
                j++;
            }
            i++;
        }
        return sum;
    }
}
