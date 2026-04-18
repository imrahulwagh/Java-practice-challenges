// 64. Create a program using for-each to the occurrences of a specific element in an array.
public class CH64 {
    public static void main(String[] args) {
        System.out.println("Welcome to the occurrence counter(Array)");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter a number to check occurrence :");
        int element = ArrayUtility.sc.nextInt();
        if(occurrenceInArray(arr,element)==0){
            System.out.println("Your element is not present in array..");
        }else{
            System.out.println("Element found "+occurrenceInArray(arr,element)+" times");
        }
        ArrayUtility.sc.close();
    }
    public static int occurrenceInArray(int[] arr,int element){
        int count = 0;
        for(int num:arr){
            if(num==element){
                count++;
            }
        }
        return count;
    }
}
