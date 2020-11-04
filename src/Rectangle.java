public class Rectangle extends Shape {
    private double length;
    private  double width;

    public Rectangle( double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public void drawShape() {

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
        Rectangle rectangle=new Rectangle(2,2);
        System.out.println(rectangle);

    }
}
