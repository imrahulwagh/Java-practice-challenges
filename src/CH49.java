// 49. Create a program to do sum and average of all elements in a 2-D array.
public class CH49 {
    public static void main(String[] args) {
        System.out.println("Welcome to sum and average in 2D elements ");
        int [][] arr = ArrayUtility.input2DArray();
        sum_avg(arr);
        ArrayUtility.sc.close();
    }
    public static void sum_avg(int[][] arr) {
        int sum = 0,i=0,count=0;
        while(i < arr.length){
            int j=0;
            while(j<arr[i].length) {
                sum += arr[i][j];
                count++;
                j++;
            }
            i++;
        }
        System.out.println("Sum = "+sum);
        float avg = (float) sum /count;
        System.out.println("Average = "+avg);
    }
}
