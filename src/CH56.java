import utils.ArrayUtility;

// 56. Create a program to Based on a student's score, categorize as
//"High", "Moderate", or "Low" using the ternary operator (e.g.,
//High for scores > 80, Moderate for 50-80, Low for < 50).
class gradeCalculator {
    static void main(String[] args) {
        System.out.println("Welcome to student score grade calculator");
        System.out.print("Enter marks : ");
        int marks = ArrayUtility.sc.nextInt();
        String category = marks>80 ? "High" : (marks<50 ? "Low" : "Moderate");
        System.out.println("Your category is : "+category);
    }
}
