public class ShapeUtil {
    public static void drawShapes(Shape[] list) {
        for (int i = 0; i < list.length; i++) {

            list[i].drawShape();
        }
    }

    public static void printShapeDetails(Shape[] list) {
        for (int i = 0; i < list.length; i++) {

            String name = list[i].getName();
            double area = list[i].getArea();



            System.out.println("Name: " + name);
            System.out.println("Area: " + area);

        }
    }
}
