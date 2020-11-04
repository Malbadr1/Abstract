public abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

   public abstract  String getName();
    public abstract void drawShape();

    public abstract double getArea();


    @Override
    public String toString() {
        return "Shape" +
                "name'" + name + '\'' +
                '}';
    }
}

