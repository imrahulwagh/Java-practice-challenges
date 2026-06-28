import utils.ArrayUtility;

// 66. Create a program using continue to sum all positive numbers entered by the
//user; skip any negative numbers.
class PositiveSum {
    static void main(String[] args) {
        System.out.println("Welcome to positive number addition");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("The sum of positive numbers from array is "+sumPositive(arr));
    }
    static int sumPositive(int[] arr){
        int sum = 0;
        for(int i : arr){
            if(i<0)
                continue;
            sum += i;
        }
        return sum;
    }
}
