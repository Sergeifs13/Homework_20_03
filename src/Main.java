import java.util.*;

public class Main {

    public static  void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
       rectangle.area();
       rectangle.perimeter();
        System.out.println("Area Rectangle "+rectangle.areaRectangle);
        System.out.println("Perimeter "+rectangle.perimeterRectangle);
       Circle circle = new Circle(4.0);
       circle.area();
       circle.perimeter();
        Triangle triangle = new Triangle(2,3,4);
        triangle.area();
        triangle.perimeter();

        List<Shape> sh = new ArrayList<>();
        sh.add(rectangle);
        sh.add(circle);
        sh.add(triangle);
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(triangle);
        Collections.sort(shapes);

        System.out.println(sh);
        System.out.println("*****************");

        Collections.sort(sh);


        System.out.println(sh);

    }

}
