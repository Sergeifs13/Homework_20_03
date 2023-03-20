public class Triangle implements Shape{
    double a,b,c;
    double areaTriangle;
    double perimeterTriangle;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void area() {
        areaTriangle = (a*b)/2;
        System.out.println("Area Triangle :"+areaTriangle);
    }

    @Override
    public void perimeter() {
        perimeterTriangle = a+b+c;
        System.out.println("Perimeter Triangle"+perimeterTriangle);

    }
}
