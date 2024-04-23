public class Main {
    public static void main(String[] args) {
        Square manuel = new Square(5);
        Resizable pablo = new Triangle(10, 5);
        Resizable carlos = new Circle(5);

        Shape rodrigo = new Shape() {
            @Override
            public double calculateArea() {
                return 0;
            }
        };

        Resizable square1 = manuel;
        square1.resize(2);
        manuel.calculateArea();

        System.out.println(rodrigo.calculateArea());

        /*System.out.println("Resizing square side 5");
        manuel.resize(2);*/

        System.out.println("Resizing triangle base 5, height 10");
        pablo.resize(2);

        System.out.println("Resizing circle radius 5");
        carlos.resize(2);

    }
}
