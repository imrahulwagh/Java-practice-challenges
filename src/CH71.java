import utils.ArrayUtility;

// 71. Concatenate and Convert: Take two strings, concatenate them,
//and convert the result to uppercase
class StringConcat {
    static void main(String[] args) {
        System.out.println("Welcome to he string operations ");
        System.out.print("Enter first name : ");
        String firstName = ArrayUtility.sc.next();
        System.out.print("Enter last name : ");
        String lastName = ArrayUtility.sc.next();
        String fullName = firstName.concat(" ").concat(lastName);
        fullName = fullName.toUpperCase();
        System.out.println("Your full name is "+fullName);
    }
}
