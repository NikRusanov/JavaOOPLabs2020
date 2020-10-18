package lab4.Shapes;

public class Point {
    private double x;
    private double y;



    public Point(double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public  void  setY(double y)  {
        this.y = y;
    }

    public double getDistance(Point p) {
        return Math.sqrt(
                Math.pow(p.getX() - x, 2) +
                Math.pow(p.getY()- y, 2)
        );
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (Math.abs(point.x - x) > 0.1) return false;

        return Math.abs(point.y - y) <= 0.1;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(y);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
