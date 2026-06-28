import utils.ArrayUtility;

// 69. Create a program using recursion to check if a string is a
// palindrome using recursion
class PalindromeChecker {
    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        if(str.length()<=1){
            return true;
        }
        int end = str.length() - 1;
        if(str.charAt(0) != str.charAt(end))
            return false;
        String newStr = str.substring(1,end);
        return isPalindrome(newStr);
    }
    static void main(String[] args) {
        System.out.println("Welcome to the palindrome checker");
        System.out.print("Enter a string : ");
        String str = ArrayUtility.sc.next();
        System.out.println("Your string is "+(isPalindrome(str) ? "Palindrome" : "not Palindrome"));
    }
}
