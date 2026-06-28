import utils.ArrayUtility;

// 72. Calculate the area and circumference of a circle for a given radius
//using Math.PI
class AreaCircumferenceOfCircle {
    public void AreaCircumference(double rad){
        double area = Math.PI * Math.pow(rad,2) ;
        // %.3f for upto 3 decimal decimal value and %n for new line
        System.out.printf("Area of circle is %.3f %n",area);
        double circumference = 2 * Math.PI * rad ;
        System.out.printf("Circumference of circle is %.3f",circumference);
    }
    static void main(String[] args) {
        System.out.println("Welcome to the area findings ");
        System.out.print("Enter the radius : ");
        double rad = ArrayUtility.sc.nextDouble();
        AreaCircumferenceOfCircle ac = new AreaCircumferenceOfCircle();
        ac.AreaCircumference(rad);
    }
}
