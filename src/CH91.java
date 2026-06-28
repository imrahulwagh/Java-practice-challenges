import utils.Utility;
import java.util.*;
/*
91. Use the Collections class to count the frequency of a particular
element in an ArrayList.
 */
class Frequency {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(1,1,2,2,3,4,5,6,6,7,8,9);
        Utility.print(numList);
        System.out.println(Collections.frequency(numList,6));
    }

}
