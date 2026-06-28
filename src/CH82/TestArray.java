package CH82;
import utils.ArrayUtility;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(ArrayUtility.inputArray());
        ArrayOperations.Statistics st = arr.new Statistics();
        double mean = st.mean();
        System.out.printf("Mean of the array is %.2f\n",mean);
        int median = st.median();
        System.out.println("Median of the array is "+median);
        //ArrayUtility.display();
    }
}
