package Ooops.Properties.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        shapes.area();
        circle.area();
        square.area();
        triangle.area();
    }
}
