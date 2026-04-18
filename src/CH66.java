// 66. Create a program using continue to sum all positive numbers entered by the
//user; skip any negative numbers.
public class CH66 {
    public static void main(String[] args) {
        System.out.println("Welcome to adding positive numbers..");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("The sum of positive number is "+sumPositive(arr));
        ArrayUtility.sc.close();
    }
    public static int sumPositive(int[] arr){
        int sum=0;
        for(int num:arr){
            if(num<0){
                continue;
            }
            sum +=num;
        }
        return sum;
    }
}
