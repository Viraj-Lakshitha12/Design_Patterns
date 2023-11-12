package structural.Decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void drow(){
        decoratorShape.drow();
        setRedShape(decoratorShape);
    }

    public void setRedShape(Shape redShape){
        System.out.println("Set Red Border");
    }


}
