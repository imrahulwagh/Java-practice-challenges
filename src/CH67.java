// 67. Create a program using continue to print only even numbers using continue for odd numbers
public class CH67 {
    public static void main(String[] args) {
        System.out.println("Welcome to even number printer..");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Even number in array are : ");
        EvenNumbersInArray(arr);
    }
    public static void EvenNumbersInArray(int[] arr){
        for (int num : arr) {
            if(num%2!=0) {
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
