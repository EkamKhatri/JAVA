import java.util.Scanner;
class Vehicle {
    public void display() 
    {
        System.out.println("This is a Vehicle");
    }
}
class Car extends Vehicle {
    public void display() 
    {
        System.out.println("This is a Car");
    }
}
class Bike extends Vehicle {
    public void display() 
    {
        System.out.println("This is a Bike");
    }
}
public class VehicleDemo {
    public static void main(String[] args) 
    {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tyres: ");
        int N = sc.nextInt();
        Vehicle v;
        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }
        v.display();
        sc.close();
    }
}

