public class Cube extends Shape {
    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
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
        Cube cube=new Cube("Cube",2);
        System.out.println(cube);
    }
}


