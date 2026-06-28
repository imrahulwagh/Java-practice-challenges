import utils.ArrayUtility;

// 63. Create a program using for-each to find the maximum value in an integer array.
class MaxNumberFinder {
    public static int maxNumber(int[] arr){
        int max = 0;
        for(int i=0;i< arr.length;i++){
            if(max<arr[i])
                max = arr[i];
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the maximum from array finder");
        int[] arr = ArrayUtility.inputArray();
        System.out.println("Maximum is "+maxNumber(arr));
    }
}
