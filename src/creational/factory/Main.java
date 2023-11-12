package creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFacotry shapeFacotry = new ShapeFacotry();
        Shape circle = shapeFacotry.getShape("Circle");
        circle.drow();

        Shape rectangle = shapeFacotry.getShape("Rectangle");
        rectangle.drow();

        Shape square = shapeFacotry.getShape("Square");
        square.drow();
    }
}
