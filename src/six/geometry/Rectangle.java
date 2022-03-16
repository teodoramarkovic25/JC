package six.geometry;

public class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(int x, int y, String color, String name, double width, double height) {
        super(x, y, color, name);
        this.height = height;
        this.width = width;
    }

    @Override
    public double areaCalculation() {
        return width * height;
    }
}
