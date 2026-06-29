// ///////////////////////////////////////////////////////////////////
//
//  Problem Statement : Create an enum called Day that represents the
//                      days of the week. Write a program that prints
//                      out all the days of the week from this enum.
//  Function name :     Printing days using enum
//  Input :             enum
//  Output :            enum
//  Description :       Declare all the days in an enum and print it
//                      iterating it by using .values() function.
//
//  Date :              30/05/2026
//  Author :            Rahul Vilas Wagh
//
// ///////////////////////////////////////////////////////////////////

package CH96;
public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Days in a week : ");
        // System.out.println(Arrays.toString(Day.values()));

        for(Day day : Day.values()){
            System.out.println(day);
        }
    }
}
