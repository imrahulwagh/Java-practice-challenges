import utils.ArrayUtility;

// 58. Create a program to create a simple calculator that uses a
//switch statement to perform basic arithmetic operations
//like addition, subtraction, multiplication, and division.
class calculator {
    static void main(String[] args) {
        System.out.println("Welcome to the calculator");
        System.out.print("Enter first number : ");
        int num1 = ArrayUtility.sc.nextInt();
        System.out.print("Enter second number : ");
        int num2 = ArrayUtility.sc.nextInt();
        System.out.print("Enter a operation to perform (+,-,*,/) : ");
        char ch = ArrayUtility.sc.next().charAt(0);
        int res = switch(ch){
            case '+' -> num1 + num2 ;
            case '-' -> num1 - num2 ;
            case '*' -> num1 * num2 ;
            case '/' -> num1 / num2 ;
            default -> -1;
        };

        System.out.println("Your answer is "+res);
    }
}
