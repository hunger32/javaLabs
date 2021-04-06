public class Rectangle extends Shape {
    protected double w,h;

    Rectangle (Point p, double w, double h)
    {
        super(p);
        this.w = w;
        this.h = h;
    }

    @Override
    Point getCenter() {
        return new Point(p.getX() + w/2, p.getY() + h/2);
    }


    @Override
    public Object clone(){
        Rectangle line= new Rectangle(this.p, this.w, this.h);
        return line;
    }
}
