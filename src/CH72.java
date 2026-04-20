// 72. Calculate the area and circumference of a circle for a given radius
//using Math.PI
public class CH72 {
    public static void main(String[] args) {
        System.out.println("Welcome to area of circle and circumference calculator..");
        System.out.print("Enter the radius : ");
        double r = ArrayUtility.sc.nextDouble();
        System.out.printf("Area of circle is %.2f\n",areaOfCircle(r));
        System.out.printf("Circumference of circle is %.2f",circumferenceOfCircle(r));
        ArrayUtility.sc.close();
    }

    public static double areaOfCircle(double rad){
        return Math.PI * rad * rad;
    }

    public static double circumferenceOfCircle(double rad){
        return 2 * Math.PI * rad;
    }
}
