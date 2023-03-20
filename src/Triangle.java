public class Triangle implements Shape{
    double a,b,c;
    double areaTriangle;
    double perimeterTriangle;

    public double getArea() {
        return areaTriangle;
    }

    @Override
    public String toString() {
        return "\n Triangle{" +
                "areaTriangle=" + areaTriangle +
                ", perimeterTriangle=" + perimeterTriangle +
                '}';
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void area() {
        areaTriangle = (a*b)/2;

    }

    @Override
    public void perimeter() {
        perimeterTriangle = a+b+c;

    }
    public double compareTo(Shape s) {
        return getArea() - s.getArea();
    }
}
