package structural.Decorator;

public class Main {
    public static void main(String[] args) {
       Shape cricle = new Cricle();
       Shape shape1 = new RedShapeDecorator(new Cricle());
       Shape shape2 = new RedShapeDecorator(new Recatangle());

        System.out.println("without Decoration");
        cricle.drow();
        System.out.println("\nwith RedShape Decoration");
        shape1.drow();
        System.out.println("\nwith RedShape Decoration");
        shape2.drow();


    }
}
