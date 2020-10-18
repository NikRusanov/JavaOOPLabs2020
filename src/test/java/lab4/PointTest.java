package lab4;

import lab4.Shapes.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PointTest {

    @Test
    public void checkDistanceBetweenPoint() {
        Point pointA = new Point(1.0,-0.2);
        Point pointB = new Point(0.0, 0.2);
        assertEquals(1.077d,pointA.getDistance(pointB),0.0001);
        assertEquals(1.077d,pointB.getDistance(pointA),0.0001);
    }
}
