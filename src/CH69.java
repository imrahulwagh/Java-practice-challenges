// 69. Create a program using recursion to check if a string is a palindrome using recursion.
public class CH69 {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome checker..");
        System.out.print("Enter a string to be checked: ");
        String str = ArrayUtility.sc.next();
        System.out.println("Your string is "+(isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
        ArrayUtility.sc.close();
    }
    public static boolean isPalindrome(String str){
        if(str.length()<=1){
            return true;
        }
        int lastPos = str.length() -1;
        if(str.charAt(0) != str.charAt(lastPos)){
            return false;
        }
        String newStr = str.substring(1,lastPos);
        // Here 1 character is inclusive and last character is exclusive
        return isPalindrome(newStr);
    }
}
