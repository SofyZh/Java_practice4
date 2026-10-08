public class ComparableCircle extends Circle {

    public ComparableCircle() {
        super();
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public int compareTo(GeometricObject o) {
        return Double.compare(this.getArea(), o.getArea());
    }
}