// 48. Create a program to search an element in a 2-D array.
public class CH48 {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D array searching..");
        int [][] arr = ArrayUtility.input2DArray();
        System.out.print("Enter an element to search : ");
        int key = ArrayUtility.sc.nextInt();
        boolean isFound = search(arr,key);
        if(isFound) {
            System.out.println("Found..");
        } else{
            System.out.println("Not Found..");
        }
        ArrayUtility.sc.close();
    }
    public static boolean search(int[][] arr,int key)
    {
        int i=0;
        while(i< arr.length) {
            int j=0;
            while(j<arr[i].length) {
                if(arr[i][j]==key)
                    return true;
                j++;
            }
            i++;
        }
        return false;
    }
}
