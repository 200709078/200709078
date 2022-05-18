// Adem VAROL - 200709078
public class ShapeDemo {
    public static void main(String[] arg) {
        // Shape circle = new Circle(3,"blue",false);
        // Shape circle = new Circle(4);
        Shape circle = new Circle();
        System.out.println(circle);
        System.out.println("Area of circle         = " + Math.round(circle.getArea() * 100.0) / 100.0);
        System.out.println("Perimeter of circle    = " + Math.round(circle.getPerimeter() * 100.0) / 100.0);
        System.out.println();

        //Shape rect = new Rectangle(3,4,"blue",false);
        //Shape rect = new Rectangle(5,6);
        Shape rect = new Rectangle();
        System.out.println(rect);
        System.out.println("Area of rectangle      = " + rect.getArea());
        System.out.println("Perimeter of rectangle = " + rect.getPerimeter());
        System.out.println();

        //Shape sq = new Square(7,"blue",true);
        //Shape sq = new Square(8);
        Shape sq = new Square();
        System.out.println(sq);
        System.out.println("Area of square         = " + sq.getArea());
        System.out.println("Perimeter of square    = " + sq.getPerimeter());

    }
}
