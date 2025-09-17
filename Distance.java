import java.util.Scanner;
class Point {
    private float x;
    private float y;
    Point() {
        x = 0;
        y = 0;
    }
    Point(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public void setX(float x) {
        this.x = x;
    }
    public void setY(float y) {
        this.y = y;
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
    public void display() {
        System.out.printf("(%7.2f, %7.2f)\n", x, y);
    }
}
public class Distance {
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        float x1 = sc.nextFloat();
        System.out.print("Enter y1: ");
        float y1 = sc.nextFloat();
        System.out.print("Enter x2: ");
        float x2 = sc.nextFloat();
        System.out.print("Enter y2: ");
        float y2 = sc.nextFloat();
        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);
        System.out.print("Point 1: ");
        p1.display();
        System.out.print("Point 2: ");
        p2.display();
        double dist = Point.distance(p1, p2);
        System.out.printf("Distance between points: %7.2f\n", dist);
    }
}
