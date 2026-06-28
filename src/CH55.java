import utils.ArrayUtility;

// 55. Create a program to calculate the absolute value of a given integer
class absoluteValue{
    int absolute(int num){
        return num<0 ?  -num : num;
    }
    static void main(String[] args) {
        System.out.println("Welcome to absolute no. checker");
        System.out.print("Enter a number : ");
        int num = ArrayUtility.sc.nextInt();
        absoluteValue abs = new absoluteValue();
        System.out.println("The Absolute Number is : "+abs.absolute(num));
    }
}
