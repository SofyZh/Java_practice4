public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = {
                new Square(5),
                new Circle(3),
                new Square(2.5, "красный", true),
                new Rectangle(4, 6),
                new Square(10)
        };

        for (GeometricObject obj : objects) {
            System.out.println("Площадь: " + obj.getArea());
            if (obj instanceof Colorable) {
                ((Colorable) obj).howToColor();
            }
            System.out.println("---");
        }
    }
}