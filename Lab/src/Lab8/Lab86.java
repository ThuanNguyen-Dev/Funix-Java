package Lab8;

// Circle
public class Lab86 {
    private double radius;

    public Lab86(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    public double getCircumference() {
        return 3.14 * 2 * radius;
    }
}
