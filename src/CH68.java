// 68. Create a program using recursion to display the Fibonacci series upto a certain number
public class CH68 {
    public static void main(String[] args) {
        System.out.println("Welcome to Fibonacci number printer..");
        System.out.print("Enter the limit : ");
        int lim = ArrayUtility.sc.nextInt();
        System.out.print("The fibonacci series is : ");
        for(int i=1;i<=lim;i++){
            System.out.print(fibonacciSeries(i)+" ");
        }
        ArrayUtility.sc.close();
    }
    public static long fibonacciSeries(int limit){
        if(limit==1){
            return 0;
        }
        if(limit==2){
            return 1;
        }
        return fibonacciSeries(limit-1)+fibonacciSeries(limit-2);
    }
}
