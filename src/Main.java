public class Main {
    /*
    Создать интерфейс Shape, содержащий методы для подсчета периметра и площади фигуры.
Создать классы Circle и Rectangle, имплементирующие этот интерфейс для круга и прямоугольника.
 В методе main класса Main создать несколько объектов
 этих классов и вывести на экран площади и периметры фигур.
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
       rectangle.area();
       rectangle.perimeter();
        System.out.println("*****************");
       Circle circle = new Circle(4.0);
       circle.area();
       circle.perimeter();
        System.out.println("*****************");
        Triangle triangle = new Triangle(2,3,4);
        triangle.area();
        triangle.perimeter();
    }
    /* OUTPUT:
Area Rectangle :6.0
Perimeter Rectangle :10.0
*****************
Area Circle :50.24
Perimeter Circle :25.12
*****************
Area Triangle :3.0
Perimeter Triangle9.0
     */
}
