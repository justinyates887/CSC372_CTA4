public class Sphere extends Shape {
    private double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Calculate surface area
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Calculate volume
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // toString method
    @Override
    public String toString() {
        return "Sphere - Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}