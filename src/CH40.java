// 40. Create a program to find the sum and average of all elements in an array.
public class CH40 {
    public static void main(String[] args) {
        int[] arr = ArrayUtility.inputArray();
        int i=0,sum=0;
        while(i<arr.length)
        {
            sum += arr[i];
            i++;
        }
        System.out.println("Sum : "+sum);
        System.out.println("Average : "+(float)sum/arr.length);
    }
}
