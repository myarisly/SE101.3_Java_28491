abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract void calculateArea();

    void display() {
        System.out.println("The shape is: " + name);
    }
}