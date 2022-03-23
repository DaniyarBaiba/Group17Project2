package Group17Project2;

public class ShapeTester {
    //Create an Interface 'Shape' with undefined methods
    //as calculateArea and calculatePerimiter. Create 2
    //classes Circle & Square that implements functionality
    //defined in the Shape Interface. Test your code.
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.calculateArea();
        circle.calculatePerimiter();
        System.out.println("*******************************");
        Square square = new Square();
        square.calculateArea();
        square.calculatePerimiter();
    }
}