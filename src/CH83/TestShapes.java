package CH83;

public class TestShapes {
    public static void main(String[] args) {
        Circle circle = new Circle(5.6);
        Square square = new Square(3);

        System.out.printf("Area of circle is %.3f %n",circle.calculateArea());
        System.out.printf("Area of square is %.3f",square.calculateArea());
    }
}
