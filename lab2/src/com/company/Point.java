package com.company;

/** Represents a point on plane
 * @author Gusarov Alexander
 */
public final class Point {
    protected final double x;
    protected final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    /** Creates a new Point exemplars.
     * @param x is offset on x-axis.
     * @param y is offset on y-axis.
     * @return Point exemplar after changing position.
     */
    public Point translate(double x, double y){
        return new Point(this.x+x, this.y+y);
    }

    /** Creates a new Point exemplars
     * @param multiplier scales x and y.
     * @return Point exemplar after scaling.
     */
    public Point scale(double multiplier){
        return new Point(this.x*multiplier, this.y*multiplier);
    }
}
