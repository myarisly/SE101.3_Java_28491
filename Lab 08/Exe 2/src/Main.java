public class Main {
    public static void main(String[] args) {
        // Creating objects of Circle, Rectangle, and Triangle
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Set properties using setter methods (optional)
        circle.setRadius(7.0);
        rectangle.setLength(5.0);
        rectangle.setWidth(8.0);
        triangle.setSide1(6.0);
        triangle.setSide2(8.0);
        triangle.setSide3(10.0);

        // Calculate area and perimeter for each shape
        double circleArea = circle.calculateArea();
        double circlePerimeter = circle.calculatePerimeter();

        double rectangleArea = rectangle.calculateArea();
        double rectanglePerimeter = rectangle.calculatePerimeter();

        double triangleArea = triangle.calculateArea();
        double trianglePerimeter = triangle.calculatePerimeter();

        // Print the results
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        System.out.println("Triangle Area: " + triangleArea);
        System.out.println("Triangle Perimeter: " + trianglePerimeter);
    }
}
