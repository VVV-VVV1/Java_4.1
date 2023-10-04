package task1;

public class TesterShape {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 4);
        System.out.println(rectangle.toString());

        Shape square = new Square(2);
        System.out.println(square.toString());

        Shape circle = new Circle(5);
        System.out.println(circle.toString());
    }
}
