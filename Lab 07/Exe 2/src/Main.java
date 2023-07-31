import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle("Circle", 10);
        circle.display();
        circle.calculateArea();

        Shape rectangle = new Rectangle("Rectangle", 20, 30);
        rectangle.display();
        rectangle.calculateArea();
    }
}