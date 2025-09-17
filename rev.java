import java.util.Scanner;
public class rev {
    public static void main(String args[]) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner scan = new Scanner(System.in);
        int n, h, t, o, rev;
        System.out.print("Enter a 3-digit number: ");
        n = scan.nextInt();
        h = n / 100;
        t = (n / 10) % 10;
        o = n % 10;
        rev = o * 100 + t * 10 + h;
        System.out.println("Reversed number: " + rev);
    }
}


