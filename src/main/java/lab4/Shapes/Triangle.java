package lab4.Shapes;

import lab4.Exception.TriangleException;

/**
 *4.	Описать класс, представляющий треугольник.
 *  Предусмотреть методы для создания объектов,
 *  вычисления площади, периметра и точки пересечения медиан.
 *  Описать свойства для получения состояния объекта.
 * <p>
 * @author Nik Rusanov
 */
public class Triangle {
    private final Point a;
    private final Point b;
    private final Point c;


    double[] distance;


    public Triangle(Point aPoint, Point bPoint, Point cPoint) throws TriangleException {
        double[] distances = getDistance(aPoint, bPoint, cPoint);
        checkTriangle(distances);
        a = aPoint;
        b = bPoint;
        c = cPoint;
        distance = distances;
    }

    private void checkTriangle(double[] distances) throws TriangleException {

            if (((distances[0] + distances[1] ) <= distances[2])
                    || ( ( distances[0] + distances[2] ) <= distances[1] )
                    || ( ( distances[1] + distances[2] ) <= distances[2] ))
                throw new TriangleException();
        }
    private void checkTriangle(Point a, Point b, Point c ) {
        try{
            double s = Math.abs( (a.getY() - c.getX()) *(b.getY() - c.getY())
                    - (b.getX() - c.getX()) * (a.getY() - c.getY()));
            if (s == 0.0 ) {
            throw new TriangleException();
            }

        } catch (TriangleException e) {
            System.err.println("Error:" + e.toString());
        }

    }

    public Point getA() {
        return a;
    }

    public Point getB() {
        return b;
    }

    public Point getC() {
        return c;
    }



    private double[] getDistance(Point aPoint, Point bPoint, Point cPoint) {
        double sideA = aPoint.getDistance(bPoint);
        double sideB = aPoint.getDistance(cPoint);
        double sideC = cPoint.getDistance(bPoint);
        return new double[]{sideA, sideB, sideC};
    }
    public double[] getDistance() {
        return distance;
    }

    public double getPerimeter() {
        return  distance[0] + distance[1] + distance[2];
    }
    public double getArea() {
        double halfPerimeter = getPerimeter()/2;
        return Math.sqrt(
                halfPerimeter
                   *(halfPerimeter - distance[0])
                   * (halfPerimeter - distance[1])
                   * (halfPerimeter - distance[2]));
    }

    public Point getMedian() {
        return new Point((a.getX() + b.getX() + c.getX())/3,
                (a.getY() +b.getY() + c.getY())/3);
    }


}
