public class Circle extends Shape{
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void drawShape() {

    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public String toString() {
        return "Circle :  " +" radius "
               + radius+",  The  Circle Area is = "+getArea();
    }

    public static void main(String[] args) {
        Circle circle=new Circle("Circle",2);
        System.out.println(circle);
    }
}
