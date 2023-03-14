package Shapes;

public class Rectangle implements Shape {

    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public double areaOfShape() {
        return width * height;
    }

    @Override
    public double perimeterOfShape() {
        return 2 * (width + height);
    }
}
