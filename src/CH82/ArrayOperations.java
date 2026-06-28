/*
82. Create a class ArrayOperations with a static nested class Statistics.
Statistics could have methods like mean(), median(), which
operate on an array.
 */
package CH82;
import utils.ArrayUtility;
import java.util.Arrays;

public class ArrayOperations {
    int[] numbers ;
    ArrayOperations(int[] numbers ){
        this.numbers = numbers ;
    }
    // static class inside class
    class Statistics{
        double mean(){
            int sum = 0 ;
            for(int i : numbers){
                sum += i;
            }
            return (double) sum /numbers.length;
        }
        int median(){
            int len = numbers.length ;
            Arrays.sort(numbers);
            if(len%2!=0){
                return numbers[len/2];
            }
            else{
                int med1 = numbers[len/2];
                int med2 = numbers[(len/2)+1];
                return (med1 + med2)/len;
            }
        }
    }
}
