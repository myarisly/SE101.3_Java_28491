class CylindricalContainer extends Container {

    public CylindricalContainer(double height, double radius) {
        super(height, radius);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}