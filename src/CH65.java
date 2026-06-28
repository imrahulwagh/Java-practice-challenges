import utils.ArrayUtility;

// 65. Create a program using break to read inputs from the user in a loop and break
//the loop if a specific keyword (like "exit") is entered.
class LoopOnExit {
    static void main(String[] args) {
        System.out.println("Welcome to the loop exit");
        boolean flag = false;
        while(true) {
            System.out.print("Enter a word : ");
            String input = ArrayUtility.sc.next();
            //input = input.toLowerCase();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("Successfully exited from loop");
    }
}
