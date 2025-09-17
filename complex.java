import java.util.Scanner;
class complex {
    int real, imag;
    complex(int r, int i) {
        real = r;
        imag = i;
    }
    complex add(complex c) {
        return new complex(real + c.real, imag + c.imag);
    }
    complex subtract(complex c) {
        return new complex(real - c.real, imag - c.imag);
    }
    complex multiply(complex c) {
        int r = (real * c.real) - (imag * c.imag);
        int i = (real * c.imag) + (imag * c.real);
        return new complex(r, i);
    }
    void display() {
        if (imag >= 0)
            System.out.println(real + " + " + imag + "i");
        else
            System.out.println(real + " - " + (-imag) + "i");
    }
    public static void main(String[] args) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        complex c1 = new complex(r1, i1);
        System.out.print("Enter real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        complex c2 = new complex(r2, i2);
        complex sum = c1.add(c2);
        complex diff = c1.subtract(c2);
        complex prod = c1.multiply(c2);
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();
        System.out.print("Product: ");
        prod.display();
    }
}
