package com.company;
/** Represents a point on plane
 * @author Gusarov Alexander
 */
public final class Dot {
    protected final double x;
    protected final double y;

    public Dot(double x, double y) {
        this.x = x;
        this.y = y;

    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    /** Mutators provides opportunity of translating and scaling with
     *  different params.
     * @param x is offset on x-axis.
     * @return Point exemplar after changing position.
     */
    public Dot setX(double x){
        return new Dot(this.x+x, this.y);
    }
    public Dot setX(double x, double multiplier){
        return new Dot((this.x+x)*multiplier, this.y);
    }

    /** Mutators provides opportunity of translating and scaling with
     *  different params.
     * @param y is offset on y-axis.
     * @return Point exemplar after changing position.
     */
    public Dot setY(double y){
        return new Dot(this.x, this.y+y);
    }
    public Dot setY(double y, double multiplier){
        return new Dot(this.x, (this.y+y)*multiplier);
    }
    public Dot set(double x, double y){
        return new Dot(this.x+x, this.y+y);
    }
    public Dot set(double x, double y, double multiplier){
        return new Dot((this.x+x)*multiplier, (this.y+y)*multiplier);
    }
}
