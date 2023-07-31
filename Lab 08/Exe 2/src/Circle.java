public class Circle implements Shape {
    private double radius;

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter and Setter methods for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Implementation of calculateArea() for Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementation of calculatePerimeter() for Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
