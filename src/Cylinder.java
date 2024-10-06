public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Calculate surface area
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Calculate volume
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // toString method
    @Override
    public String toString() {
        return "Cylinder - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}