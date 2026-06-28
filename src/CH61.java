import utils.ArrayUtility;

// 61. Create a program using for loop multiplication table for a number.
class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Welcome to the multiplication table ");
        System.out.print("Enter a number : ");
        int num = ArrayUtility.sc.nextInt();
        System.out.println();
        for(int i=1;i<=10;i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
