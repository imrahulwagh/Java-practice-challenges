import utils.ArrayUtility;

// 57. Create a program to print the month of the year based on a
//number (1-12) input by the user.
class MonthPrinter {
    static void main(String[] args) {
        System.out.println("Welcome to the month printer ");
        System.out.print("Enter a number of month : ");
        int month = ArrayUtility.sc.nextInt();
        String output = switch(month){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month number";
        };
        System.out.println(output);
    }
}
