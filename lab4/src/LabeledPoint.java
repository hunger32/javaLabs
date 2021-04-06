public class LabeledPoint extends Point {
    private String label;

    LabeledPoint(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    String getLabel()
    {
        return label;
    }

    public String toString()
    {
        return label + "\n" + super.toString();
    }
}
