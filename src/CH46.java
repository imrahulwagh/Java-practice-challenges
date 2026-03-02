// 46. Create a program to check is the array is palindrome or not.
public class CH46 {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal ");
        int[] arr = ArrayUtility.inputArray();
        boolean isPalin = palinArray(arr);
        if(isPalin){
            System.out.println("Array is palindrome..");
        }
        else{
            System.out.println("Array is not palindrome..");
        }
    }
    public static boolean palinArray(int[] arr)
    {
        int i=0;
        while(i< arr.length/2) {
            if(arr[i] != arr[arr.length-1-i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
