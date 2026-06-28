// 75. Take an array of words and concatenate them into a single string
//using StringBuilder.
class ConcatArray {
    public static void main(String[] args) {
        String[] words = new String[]{"My","name","is","Rahul"};
        StringBuilder sb = new StringBuilder();
        for(String s : words){
            sb.append(s).append(" ");
        }
        System.out.println(sb.toString());
    }
}
