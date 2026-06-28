import utils.ArrayUtility;
import static java.lang.System.exit;
// 73. Simulate a dice roll using Math.random() and display the outcome
//(1 to 6).
class Dice {
    int roll(){
        double random =  Math.random() * 6 ;
        return (int) Math.ceil(random);
    }
    public static void main(String[] args) {
        Dice dice = new Dice();
        System.out.println("Welcome to the dice roller");
        do{
            System.out.println("Enter 1 to roll the dice and 0 to exit : ");
            int num = ArrayUtility.sc.nextInt();
            if(num==1){
                System.out.println("Next is : "+dice.roll());
            }else if(num==0){
                System.out.println("Successfully exited");
                exit(0);
            }
            else{
                System.out.println("Invalid input");
            }
        }while(true);
    }
}
