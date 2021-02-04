package lab4;

import lab4.Exception.TriangleException;
import lab4.Shapes.Point;
import lab4.Shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        try {
            Triangle  triangle =  new Triangle(new Point(0.0,0.0),
                    new Point(1.0,2.0),
                    new Point(3.0,-4.0));

            System.out.println(triangle);
            System.out.println("Area: "+ triangle.getArea());
            System.out.println("Perimeter: "+ triangle.getPerimeter());
            System.out.println("Median: "+ triangle.getMedian());
        } catch (TriangleException e) {
            e.printStackTrace();
        }
    }
}
