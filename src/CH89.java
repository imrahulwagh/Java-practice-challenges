/*
89. Write a method concatenate Strings that takes variable arguments
of String type and concatenates them into a single string.
 */
class ConcatenateStrings {
    public static void main(String[] args) {

        System.out.println(concatenate("My","Name","is","Rahul."));
        System.out.println(concatenate("Rahul","Vilas","Wagh"));

    }
    public static String concatenate(String... str){
        StringBuilder fullStr = new StringBuilder();
        for (String s : str) {
            fullStr.append(s).append(" ");
        }
        return fullStr.toString();
    }
}
