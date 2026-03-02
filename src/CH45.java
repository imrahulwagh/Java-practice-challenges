// 45. Create a program to reverse an array.

public class CH45 {
    public static void main(String[] args) {
        System.out.println("Welcome to array reversal ");
        int[] arr = ArrayUtility.inputArray();
        reverseArray(arr);
    }
    public static void reverseArray(int[] arr)
    {
        if(arr.length==0)
        {
            System.out.println("Array is empty");
            return;
        }
        else{
            int i=0;
            while(i< arr.length/2)
            {
                int temp = arr[i];
                arr[i] = arr[(arr.length-1)-i];
                arr[(arr.length-1)-i] = temp;
                i++;
            }
        }
        System.out.println("Reverse array is : ");
        ArrayUtility.displayArray(arr);
    }

}
