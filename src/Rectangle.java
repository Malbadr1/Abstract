public class Rectangle extends Shape {
    private double length;
    private  double width;

    public Rectangle(String name, double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangle...");

    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return "Rectangle :  " +
                "length=" + length +
                ", width=" + width +"  The  Rectangle Area is = "+getArea();
    }

    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(" a rectangle",2,2);
        System.out.println(rectangle);
    }
}
