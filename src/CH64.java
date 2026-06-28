import utils.ArrayUtility;

// 64. Create a program using for-each to the occurrences of a specific element in an array.
class OccurrencesInArray {
    static void main(String[] args) {
        System.out.println("welcome to the occurrence finder ");
        int[] arr = ArrayUtility.inputArray();
        System.out.print("Enter a number : ");
        int num = ArrayUtility.sc.nextInt();
        int occ = ArrayUtility.noOfOccurrences(arr,num);
        if(occ==0){
            System.out.println("Number not found");
        }else{
            System.out.println(num+" occurred "+occ+" times in an array");
        }
    }
}
