import utils.ArrayUtility;

// 54. Create a program to find if the given number is even or odd
class oddEven {
    boolean oddEvenNumber(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to OddEven no. checker");
        System.out.println("Enter a number : ");
        int num = ArrayUtility.sc.nextInt();
        oddEven res = new oddEven();
        System.out.println("The Number is : "+((res.oddEvenNumber(num)) ? "Even" : "Odd"));
    }
}
