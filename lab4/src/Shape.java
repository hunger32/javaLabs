public abstract class Shape implements Cloneable{
    protected Point p;

    Shape (Point p)
    {
        this.p = p;
    }

    void moveBy(double dx, double dy)
    {
        this.p = new Point(p.getX() + dx, p.getY() + dy);
    }

    abstract Point getCenter();
}
