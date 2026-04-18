//65. Create a program using break to read inputs from the user in a loop and break
//the loop if a specific keyword (like "exit") is entered.
public class CH65 {
    public static void main(String[] args) {
        do{
            System.out.print("Enter a command : ");
            String input = ArrayUtility.sc.next();
            if(input.equalsIgnoreCase("exit")){
                break;
            }
        }while(true);
        System.out.println("You have successfully exited");
        ArrayUtility.sc.close();
    }
}
