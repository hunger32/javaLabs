public class Line extends Shape {
    Point p2;

    Line (Point p1, Point p2)
    {
        super(p1);
        this.p2 = p2;
    }

    @Override
    Point getCenter() {
        return new Point(p.getX() + (p2.getX() - p.getX()) / 2, p.getY() + (p2.getY() - p.getY()) / 2);
    }

    @Override
    void moveBy(double dx, double dy) {
        super.moveBy(dx, dy);
        this.p2 = new Point(p2.getX() + dx, p2.getY() + dy);
    }

    @Override
    public Object clone(){
        Line line= new Line(this.p, this.p2);
        return line;
    }
}
