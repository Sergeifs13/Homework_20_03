public class Circle implements Shape{
    double PI = 3.14;
    double r;
    double areaCircle;
    double perimeterCircle;

    public double getArea() {
        return areaCircle;
    }

    @Override
    public String toString() {
        return "\n Circle{" +
                "areaCircle=" + areaCircle +
                ", perimeterCircle=" + perimeterCircle +
                '}';
    }
    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        areaCircle = PI * (r * r);
    }

    @Override
    public void perimeter() {
        perimeterCircle = 2 * PI * r;

    }
    public double compareTo(Shape s) {
        return  getArea() - s.getArea();
    }
}
