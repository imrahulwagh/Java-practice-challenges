import utils.ArrayUtility;

// 68. Create a program using recursion to display the Fibonacci series upto a certain number.
class fibonacciSeriesPrinter {
    static int fibonacciSeries(int num){
        if (num == 1) {
            return 0;
        }
        if(num==2){
            return 1;
        }
        return fibonacciSeries(num-1) + fibonacciSeries(num-2);
    }
    static void main(String[] args) {
        System.out.println("Welcome to fibonacci series printer");
        System.out.print("Enter the no. of elements to be printed : ");
        int count = ArrayUtility.sc.nextInt();
        for(int i=1;i<=count;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }
    }
}
