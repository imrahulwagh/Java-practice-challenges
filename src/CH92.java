import utils.Utility;
import java.util.Arrays;
import java.util.List;
/*
92. Write a method that swaps two elements in an ArrayList, given
their indices.
 */

class Swapping {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(10,20,30,50,40);
        Utility.print(numList);
        swapUsingIndex(numList,3,4);
        Utility.print(numList);
    }
    public static void swapUsingIndex(List<Integer> numList,Integer index1,Integer index2){
        Integer temp = numList.get(index1);
        numList.set(index1, numList.get(index2));
        numList.set(index2, temp);
    }
}
