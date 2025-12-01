package Lab7Scenario0;

public class Lab7CirclePoint {
    public static void main(String[] args) {
        Point p = new Point(20, 10);
        Circle c = new Circle(p ,5);
        p.setY(5);
        p.setX(5);
        System.out.println(c.r);
        System.out.println(c.center.getX());
        System.out.println(c.center.getY());
    }
}
