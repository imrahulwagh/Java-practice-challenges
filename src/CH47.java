// 47. Create a program to merge two sorted arrays.
public class CH47 {
    public static void main(String[] args) {
        System.out.println("Welcome to array merging tool..");
        int[] arr1 = ArrayUtility.inputArray();
        System.out.println();
        int[] arr2 = ArrayUtility.inputArray();
        System.out.println("Your merged array is : ");
        int[] mergedArray = mergeArray(arr1,arr2);
        ArrayUtility.displayArray(mergedArray);
        ArrayUtility.sc.close();
    }

    public static int[] mergeArray(int[] arr1,int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length || j<arr2.length) {
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArray[k] = arr1[i];
                i++;
            }
            else {
                newArray[k] = arr2[j];
                j++;
            }
            k++;
        }
        return newArray;
    }
}
