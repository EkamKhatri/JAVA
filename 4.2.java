class triangle {
    int a, b, c;
    triangle() {
        a = 3;
        b = 4;
        c = 5;
    }
    double perimeter() {
        return a + b + c;
    }
    double area() {
        double s = perimeter() / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        triangle t = new triangle();
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
    }
}
