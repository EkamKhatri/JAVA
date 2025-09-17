import java.util.Scanner;
public class sum {
    public static void main(String args[]) {
        System.out.print("Ekam Khatri, 24csu335\n");
        Scanner scan = new Scanner(System.in);
        int n, h, t, o, sum;
        System.out.print("Enter a 3-digit number: ");
        n = scan.nextInt();
        h = n / 100;
        t = (n / 10) % 10;
        o = n % 10;
        sum = h + t + o;
        System.out.println("Sum of digits: " + sum);
    }
}


