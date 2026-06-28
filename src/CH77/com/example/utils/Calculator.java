package CH77.com.example.utils;

import CH77.com.example.geometry.Circle;
import CH77.com.example.geometry.Rectangle;
import org.w3c.dom.ls.LSOutput;

public class Calculator {
    public static void main(String[] args) {
        Circle c = new Circle(5);
        Rectangle r = new Rectangle(10,5);

        double areaOfCircle = Math.PI * Math.pow(c.radius,2);
        double areaOfRectangle = r.length * r.breadth;

        System.out.printf("Area of Circle is %.3f",areaOfCircle);
        System.out.printf("\nArea of Rectangle is %.3f",areaOfRectangle);
    }
}
