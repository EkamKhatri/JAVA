class Shape {
    public void printShape() 
    {
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape {
    public void printRectangle() 
    {
        System.out.println("This is rectangular shape");
    }
}
class Circle extends Shape {
    public void printCircle() 
    {
        System.out.println("This is circular shape");
    }
}
class Square extends Rectangle {
    public void printSquare() 
    {
        System.out.println("Square is a rectangle");
    }
}
public class ShapeDemo {
    public static void main(String[] args) 
    {
        System.out.print("Ekam Khatri, 24csu335\n");
        Square sq = new Square();
        sq.printShape();     
        sq.printRectangle(); 
    }
}
