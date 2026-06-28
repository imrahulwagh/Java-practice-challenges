import utils.ArrayUtility;
// 74. Create a number guessing game where the program selects a
//random number, and the user has to guess it.
class NewGuessingGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the number guessing game ");
        int num = (int)(Math.random() * 100) + 1;
        int guess;
        boolean flag = false;
        int count=0;
        do{
            count++;
            if(count>3){
                System.out.println("Sorry, You are out of moves..");
                System.out.println("The actual number is "+num);
                break;
            }
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
