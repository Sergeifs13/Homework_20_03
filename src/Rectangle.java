public class Rectangle implements Shape {
    double a, b;
   double areaRectangle;

    public double getArea() {
        return areaRectangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "areaRectangle=" + areaRectangle +
                ", perimeterRectangle=" + perimeterRectangle +
                '}';
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double perimeterRectangle;

    @Override
    public void area() {
        areaRectangle = a * b;

    }

    @Override
    public void perimeter() {
        perimeterRectangle = (a + b) * 2;

    }
    public double compareTo(Shape s) {
        return getArea() - s.getArea();
    }
}
