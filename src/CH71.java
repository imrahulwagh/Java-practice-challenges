// 71. Concatenate and Convert: Take two strings, concatenate them,
//and convert the result to uppercase.
public class CH71 {
    public static void main(String[] args) {
        System.out.print("Enter first string : ");
        String str1 = ArrayUtility.sc.next();
        System.out.print("Enter second string : ");
        String str2 = ArrayUtility.sc.next();

        String str3 = str1.concat(" ").concat(str2);
        System.out.println("\n"+str3.toUpperCase());
    }
}
