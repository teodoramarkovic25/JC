package six.geometry;

public class Circle extends Shape{

    private double r;
    public Circle(int x, int y, String color, String name, double r) {
        super(x, y, color, name);
        this.r = r;
    }

    @Override
    public double areaCalculation() {
        return r*r*Math.PI;
    }
}
