public class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter and Setter methods for length and width
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Implementation of calculateArea() for Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementation of calculatePerimeter() for Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
