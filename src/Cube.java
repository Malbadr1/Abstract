public class Cube extends Shape {
    private double side;

    public Cube( double side) {
        super(" Cube");
        this.side = side;
    }


    @Override
    public String getName() {
        return "cube";
    }

    @Override
    public void drawShape() {

    }

    @Override
    public double getArea() {
        return 6*(side*side);
    }
    public String toString() {
        return "Cube :  " +
                "side=" + side+"  The  Cube Area is = "+getArea();
    }

    public static void main(String[] args) {
        Cube cube=new Cube(2);
        System.out.println(cube);
    }
}


