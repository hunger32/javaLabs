public class Circle extends Shape {
    protected double r;

    Circle (Point p, double r)
    {
        super(p);
        this.r = r;
    }

    @Override
    Point getCenter() {
        return p;
    }

    @Override
    public Object clone(){
        Circle circle = new Circle(this.p, this.r);
        return circle;

    }
}
