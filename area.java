import java.util.Scanner;
class area {
    int length, breadth;
    area(int l, int b) {
        length = l;
        breadth = b;
    }
    int returnarea() {
        return length * breadth;
    }
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        area rect = new area(l, b);
        System.out.println("Area: " + rect.returnarea());
    }
}
