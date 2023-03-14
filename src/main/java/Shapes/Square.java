package Shapes;

public class Square implements Shape {
    private double x;
    private double y;
    private double width;

    public Square(double x, double y, double width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    @Override
    public double areaOfShape() {
        return width * width;
    }

    @Override
    public double perimeterOfShape() {
        return 4 * width;
    }
}
