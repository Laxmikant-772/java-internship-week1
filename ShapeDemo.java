
interface Shape {

    void area();

    void perimeter();
}

class Rectangle implements Shape {

    double length = 15;
    double width = 5;

    public void area() {
        System.out.println("Area: " + (length * width));
    }

    public void perimeter() {
        System.out.println("Perimeter: " + (2 * (length + width)));
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Rectangle r = new Rectangle();

        r.area();
        r.perimeter();
    }
}


