package shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Circle perimeter: " + circle.getPerimeter());

        Shape square = new Square(5.0);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Square perimeter: " + square.getPerimeter());

        Shape rectangle = new Rectangle(5.0, 10.0);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle perimeter: " + rectangle.getPerimeter());
    }
}