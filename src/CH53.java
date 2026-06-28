import utils.ArrayUtility;

// 53. Create a program to find the minimum of two numbers.
class minNumberTer {
    int min(int num1,int num2){
        return num1<num2 ? num1 : num2;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to minimum no. checker");
        System.out.println("Enter two numbers : ");
        int num1 = ArrayUtility.sc.nextInt();
        int num2 = ArrayUtility.sc.nextInt();
        minNumberTer minimum = new minNumberTer();
        int res = minimum.min(num1,num2);
        System.out.println("The minimum is : "+res);
    }
}
