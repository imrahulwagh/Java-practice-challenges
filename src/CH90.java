/*
90. Write a program that sorts a list of String objects in descending
order using a custom Comparator.
 */
import utils.Utility;
import java.util.*;

class SortInDescending {
    public static void main(String[] args) {
        List <String> numList = Arrays.asList("Rahul","Yash","Bhavesh","Piya");
        sortInDescending(numList);
        Utility.print(numList);
    }
    public static void sortInDescending(List<String> strList){
        Collections.sort(strList, new Comparator<String>() {
            @Override
            public int compare(String s, String t) {
                if(s.equals(t)){
                    return 0;
                } else if(s.charAt(0) < t.charAt(0)){
                    return 1;
                } else{
                    return -1;
                }
            }
        });
    }
}
