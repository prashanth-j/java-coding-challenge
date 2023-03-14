package Shapes;

public class Circle implements Shape {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public double areaOfShape() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeterOfShape() {
        return 2 * Math.PI * radius;
    }
}
