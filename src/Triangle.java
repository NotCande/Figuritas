public class Triangle extends Shape implements Resizable{

    private double height;
    private double base;

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return (base * height)/2;
    }

    @Override
    public void resize(double ratio) {
        height *= ratio;
        base *= ratio;

        System.out.println("Resizing ratio: " + ratio);
        System.out.println("New area: " + calculateArea());
    }
}
