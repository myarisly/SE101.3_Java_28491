public class Triangle implements Shape {
    private double side1;
    private double side2;
    private double side3;

    // Constructor for Triangle
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    // Getter and Setter methods for side1, side2, and side3
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    // Implementation of calculateArea() for Triangle
    @Override
    public double calculateArea() {
        // Using Heron's formula to calculate area of a triangle
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implementation of calculatePerimeter() for Triangle
    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}
