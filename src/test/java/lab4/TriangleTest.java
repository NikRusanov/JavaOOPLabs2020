package lab4;

import lab4.Exception.TriangleException;
import lab4.Shapes.Point;
import lab4.Shapes.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TriangleTest {


    @Test
    public  void createWrongTriangle() {
        //4 5 10
        Throwable exception = assertThrows(
                TriangleException.class, () -> new Triangle(
                        new Point(0.0,0.0),
                        new Point(2.0,0.0),
                        new Point(3.0,0.0)
        ));
        assertEquals("Bad sides of triangle", exception.toString());

         exception = assertThrows(
                TriangleException.class, () -> new Triangle(
                        new Point(0.0,0.0),
                        new Point(0.0,0.0),
                        new Point(0.0,0.0)
                ));
        assertEquals("Bad sides of triangle", exception.toString());
    }


    Triangle triangle;
    @Test
    public void createNormalTriangle() throws TriangleException {
        triangle =  new Triangle(new Point(0.0,0.0),
                new Point(1.0,2.0),
                new Point(3.0,-4.0));

    }



    @Test
    public void calculateTriangleArea() throws TriangleException {
        createNormalTriangle();
        assertEquals(5.0,triangle.getArea(),0.01);
    }

    @Test
    public void calculateTrianglePerimeter() throws TriangleException {
        createNormalTriangle();

        assertEquals(13.54,triangle.getPerimeter(),0.1);
    }

    @Test
    public void calculateTriangleCentroid() throws TriangleException{
        createNormalTriangle();
        assertEquals(new Point(1.33, -0.66),triangle.getMedian());
    }
}
