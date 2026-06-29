// ///////////////////////////////////////////////////////////////////
//
//  Problem Statement : Enhance the Day enum by adding an attribute that
//                      indicates whether it is a weekday or weekend. Add
//                      a method in the enum that returns whether it's a
//                      weekday or weekend, and write a program to print
//                      out each day along with its type.
//  Input :             enum
//  Output :            enum
//  Description :       Declare all the days in an enum and print it
//                      iterating it by using .values() along with
//                      getType() function.
//  Date :              30/05/2026
//  Author :            Rahul Vilas Wagh
//
// ///////////////////////////////////////////////////////////////////

package CH97;
public class EnumTest {

    public static void main(String[] args) {
        System.out.println("Printing All days ");
        for(Day day : Day.values()){
            System.out.printf("%s : %s\n",day,day.getDayType());
        }
    }
}
