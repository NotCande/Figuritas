public class Square extends Shape implements Resizable{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void resize(double ratio) {
        side *= ratio;

        System.out.println("Resizing ratio: " + ratio);
        System.out.println("New area: " + calculateArea());
    }
}
