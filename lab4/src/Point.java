import java.util.Objects;

public class Point implements Cloneable{
    protected double x, y;

    Point(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    double getX()
    {
        return x;
    }

    double getY()
    {
        return y;
    }

    public String toString() {
        return String.format("x: %f\ny: %f", x, y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public Object clone(){
        Point point = new Point(this.x, this.y);
        return point;
    }
}

