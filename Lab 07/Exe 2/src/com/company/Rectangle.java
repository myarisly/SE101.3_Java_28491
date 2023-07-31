import java.awt.*;

class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        int area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }
}