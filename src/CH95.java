// ///////////////////////////////////////////////////////////////////
//
//  Problem Statement : Write a program that takes a string and returns
//                      the number of unique characters using a Set.
//  Function name :     finding no.of unique characters in string using set.
//  Input :             String
//  Output :            int
//  Description :       Take string as input and store it in a set by 
//                      implementing HashSet because any type of set avoids 
//                      duplication, and we got the result.
//                      according to it.
//  Date :              29/05/2026
//  Author :            Rahul Vilas Wagh
//
// ///////////////////////////////////////////////////////////////////

import java.util.HashSet;
import java.util.Set;
import utils.ArrayUtility;
class UniqueCharacters {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();

        System.out.print("Enter your string : ");
        String str = ArrayUtility.sc.next();

        for (char ch : str.toUpperCase().toCharArray()) {
            unique.add(ch);
        }

        System.out.printf("There are %d unique characters in your string",unique.size());
    }
}
