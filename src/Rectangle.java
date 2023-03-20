public class Rectangle implements Shape {
    double a, b;
    double areaRectangle;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double perimeterRectangle;

    @Override
    public void area() {
        areaRectangle = a * b;
        System.out.println("Area Rectangle :" + areaRectangle);
    }

    @Override
    public void perimeter() {
        perimeterRectangle = (a + b) * 2;
        System.out.println("Perimeter Rectangle :" + perimeterRectangle);

    }
}
