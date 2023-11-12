package structural.facade;

public class ShapeMaker {
    private Shape cricle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        cricle=new Cricle();
        rectangle=new Recatangle();
        square=new Square();
    }

    public void drowCricle(){
        cricle.drow();;
    }

    public void drowRectangle(){
        rectangle.drow();
    }
    public void drowSquare(){
        square.drow();
    }
}