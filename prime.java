import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekam Khatri, 24csu335\n");        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        if (num <= 1) 
        {
            System.out.println("Number is Not Prime");
        } 
        else 
        {
            int count = 0;
            for (int i = 2; i <= num / 2; i++) 
            {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println("Number is Prime");
            } 
            else 
            {
                System.out.println("Number is Not Prime");
            }
        }
        sc.close();
    }
}
