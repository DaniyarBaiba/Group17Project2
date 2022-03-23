package Group17Project2;

interface Shape{
    void calculateArea();
    void calculatePerimiter();
}
class Circle implements Shape{
    @Override
    public void calculateArea() {
        double radius = 7;
        double area=radius*radius*Math.PI;
        System.out.println("The area of the circle is radius ="+radius+" = "+area);
    }
    @Override
    public void calculatePerimiter() {
        double radius=7;
        double perimeter=radius*Math.PI;
        System.out.println("The perimeter of the circle is : "+perimeter);
    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        int s=7;
        int squareArea=s*s;
        System.out.println("The are of the square is "+squareArea);
    }

    @Override
    public void calculatePerimiter() {
        int side=5;
        int squarePerimeter = 4*side;
        System.out.println("The perimeter of the square is "+squarePerimeter);
    }
}


