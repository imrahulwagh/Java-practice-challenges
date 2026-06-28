import utils.ArrayUtility;

// 67. Create a program using continue to print only even numbers using continue for odd numbers.
class PrintEven {
    static void main(String[] args) {
        System.out.println("Welcome to the even number printing ");
        System.out.print("Enter the limit : ");
        int num = ArrayUtility.sc.nextInt();
        for(int i=1;i<=num;i++){
            if(i%2 != 0)
                continue;
            System.out.println(i+" ");
        }
    }
}
