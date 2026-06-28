package CH83;

public class Circle extends Shape{
    private double radius ;

    Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(radius,2);
    }
}
