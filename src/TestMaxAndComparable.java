public class TestMaxAndComparable {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Circle c2 = new Circle(8);
        System.out.println("Больший круг: " + GeometricObject.max(c1, c2));

        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(3, 10);
        System.out.println("Больший прямоугольник: " + GeometricObject.max(r1, r2));

        ComparableCircle cc1 = new ComparableCircle(4);
        ComparableCircle cc2 = new ComparableCircle(6);
        System.out.println("Больший ComparableCircle: " +
                (cc1.compareTo(cc2) > 0 ? cc1 : cc2));

        System.out.println("Больший из круга и прямоугольника: " +
                GeometricObject.max(c1, r1));
    }
}