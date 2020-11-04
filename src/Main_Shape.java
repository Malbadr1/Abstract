public class Main_Shape {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[3];
        shapeList[0] = new Rectangle( 4.0,2.0);
        shapeList[1] = new Cube(3.0);
        shapeList[2]=new Circle(2.0);


        ShapeUtil.drawShapes(shapeList);


        ShapeUtil.printShapeDetails(shapeList);
    }
}
