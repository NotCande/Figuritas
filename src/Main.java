public class Main {
    public static void main(String[] args) {
        Square manuel = new Square(5);
        Triangle pablo = new Triangle(10, 5);
        Circle carlos = new Circle(5);

        System.out.println("El area del cuadrado con lado 5 es: " + manuel.calculateArea());
        System.out.println("El area del triangulo con lado 5 y altura 10 es: " + pablo.calculateArea());
        System.out.println("El area del circulo con radio de 5 es: " + carlos.calculateArea());
    }
}