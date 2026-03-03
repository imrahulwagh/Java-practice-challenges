// 44. Create a program to return a new array deleting a specific element.
import java.util.Scanner;
public class CH44 {
    public static void main(String[] args) {
        int[] arr1 = ArrayUtility.inputArray();
        System.out.print("Enter a number to delete By Value : ");
        int value = ArrayUtility.sc.nextInt();
        int[] newArray1 = deleteByValue(arr1,value);
        ArrayUtility.displayArray(newArray1);
        // System.out.println();

//        int[] arr2 = ArrayUtility.inputArray();
//        System.out.print("Enter a number to delete By position : ");
//        int  pos = ArrayUtility.sc.nextInt();
//        int[] newArray2 = deleteByValue(arr2,pos);
//        ArrayUtility.displayArray(newArray2);
        ArrayUtility.sc.close();
    }

    // delete a specific element
    public static int[] deleteByValue(int[] arr,int key){
        int occNo = CH41.occurrenceInArray(arr,key);
        if(occNo==0){
            System.out.println("The element is not present in the array..");
            return arr;
        }
        int newSize = arr.length - occNo;
        int[] updatedArray = new int[newSize];
        int i=0,j=0;
        while(i<arr.length) {
            if(arr[i]!=key){
                updatedArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return updatedArray;
    }

    // delete a specific element
    public static int[] deleteByPosition(int[] arr,int pos){
        if(pos>arr.length || 0 > pos){
            System.out.println("The position must be within the Array size..(1-"+arr.length+")");
            return arr;
        }
        int occNo = CH41.occurrenceInArray(arr,arr[pos]);
        int newSize = arr.length - occNo;
        int[] updatedArray = new int[newSize];
        int i=0,j=0;
        while(i<arr.length) {
            if((i+1)!=pos){
                updatedArray[j] = arr[i];
                j++;
            }
            i++;
        }
        return updatedArray;
    }
}
