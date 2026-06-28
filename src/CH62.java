import utils.ArrayUtility;

// 62. Create a program using for to display if a number is prime or not.
class PrimeNumberChecker {
    static boolean primeNumber(int num){
        if(num <= 1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the prime number checker");
        System.out.print("Enter a number : ");
        int num = ArrayUtility.sc.nextInt();
        if(primeNumber(num)){
            System.out.println("Number is prime");
        } else{
            System.out.println("Number is not prime");
        }
    }
}
