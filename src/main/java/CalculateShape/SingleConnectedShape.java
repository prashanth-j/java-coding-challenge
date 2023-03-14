package CalculateShape;

import Shapes.Circle;
import Shapes.Rectangle;
import Shapes.Shape;
import Shapes.Square;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingleConnectedShape {
    public static void main(String[] args) {
        String fileName = "shapes.txt"; // replace with the name of your input file
        List<Shape> shapes = readShapes(fileName);

        // check if shapes form a single-connected shape
        if (isSingleConnected(shapes)) {
            double area = calculateArea(shapes);
            double perimeter = calculatePerimeter(shapes);
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        } else {
            System.out.println("Shapes do not form a single-connected shape.");
        }
    }

    // read in shapes from a file
    public static List<Shape> readShapes(String fileName) {
        List<Shape> shapes = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                String type = parts[0];
                double x = Double.parseDouble(parts[1]);
                double y = Double.parseDouble(parts[2]);
                if (type.equals("R")) {
                    double w = Double.parseDouble(parts[3]);
                    double h = Double.parseDouble(parts[4]);
                    shapes.add(new Rectangle(x, y, w, h));
                } else if (type.equals("S")) {
                    double w = Double.parseDouble(parts[3]);
                    shapes.add(new Square(x, y, w));
                } else if (type.equals("C")) {
                    double r = Double.parseDouble(parts[3]);
                    shapes.add(new Circle(x, y, r));
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return shapes;
    }

    public static boolean isSingleConnected(List<Shape> shapes) {
        // TODO: implement
        return true;
    }

    // calculate the area of a single-connected shape
    public static double calculateArea(List<Shape> shapes) {
        double area = 0.0;
        for (Shape shape : shapes) {
            area += shape.areaOfShape();
        }
        return area;
    }

    public static double calculatePerimeter(List<Shape> shapes) {
        double perimeter = 0.0;
        for (Shape shape : shapes) {
            perimeter += shape.perimeterOfShape();
        }
        return perimeter;
    }
}