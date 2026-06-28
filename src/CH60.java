import utils.ArrayUtility;

// 60. Create a program using do-while to implement a number guessing game.
class GuessingGame {
    static void main(String[] args) {
        System.out.println("Welcome to the number guessing game ");
        int num = (int)(Math.random() * 100) + 1;
        int guess;
        boolean flag = false;
        do{
            System.out.print("Guess a number : ");
            guess = ArrayUtility.sc.nextInt();
            if(num == guess){
                System.out.println("You have successfully guessed the number..");
                flag = true;
            }
            else if(guess>num){
                System.out.println("Smaller");
            }
            else {
                System.out.println("Higher");
            }
        }while(!flag);

    }
}
