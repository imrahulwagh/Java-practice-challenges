// 63. Create a program using for-each to find the maximum value in an integer array.
public class CH63 {
    public static void main(String[] args) {
        System.out.println("Welcome to Maximum Number finder(array)");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Maximum number from array is "+maxNumberFromArray(arr));
        ArrayUtility.sc.close();
    }
    public static int maxNumberFromArray(int[] arr){
        int max =arr[0];
        for(int num:arr){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}
