public class Circle extends Shape implements Resizable{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void resize(double ratio) {
        radius *= ratio;

        System.out.println("Resizing ratio: " + ratio);
        System.out.println("New area: " + calculateArea());
    }
}
