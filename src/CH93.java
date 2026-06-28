// ///////////////////////////////////////////////////////////////////
//
//  Problem Statement : Create a program that reverses the
//                      elements of a List and prints the
//                      reversed list.
//  Function name :     reverseList
//  Input :             List
//  Output :            List
//  Description :       Accepts a list and uses reverseList
//                      function to reverse the list using the
//                      swapping logic used in previous challenge.
//  Date :              29/05/2026
//  Author :            Rahul Vilas Wagh
//
// ///////////////////////////////////////////////////////////////////

import java.util.Arrays;
import java.util.List;
class ListReversal {
    public static void main(String[] args) {
        List<Integer> numList = Arrays.asList(11,22,33,44,55);
        System.out.println("Before reversal..");
        System.out.println(numList);
        reverseList(numList);
        System.out.println("After reversal..");
        System.out.println(numList);
    }
    public static void reverseList(List<Integer> list){
        for(int i=0;i<list.size()/2;i++){
            Swapping.swapUsingIndex(list,i,list.size() - 1 - i);
        }
    }
}
