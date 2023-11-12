package creational.factory;

public class ShapeFacotry {

    public Shape getShape(String shapeType){
        if (shapeType==null){
          return null;
        }else {
            if (shapeType.equals("Circle")){
                return new Circle();
            }else if (shapeType.equals("Rectangle")){
                return new Recatangle();
            }else if (shapeType.equals("Square")) {
                return new Square();
            }
        }
        return null;
    }
}
