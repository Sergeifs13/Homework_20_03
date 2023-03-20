public class Circle implements Shape {
    double PI = 3.14;
    double r;
    double areaCircle;
    double perimeterCircle;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        areaCircle = PI * (r * r);
        System.out.println("Area Circle :" + areaCircle);
    }

    @Override
    public void perimeter() {
        perimeterCircle = 2*PI * r;
        System.out.println("Perimeter Circle :" + perimeterCircle);
    }
}
