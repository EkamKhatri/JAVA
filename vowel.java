import java.util.Scanner;
public class vowel{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekam Khatri, 24csu335\n");
        System.out.print("Enter a single character: ");
        String input = sc.next();
        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) 
        {
            System.out.println("Error: Please enter a single alphabet character.");
        } 
        else 
        {
            char ch = input.charAt(0);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
            {
                System.out.println("Vowel");
            } 
            else 
            {
                System.out.println("Consonant");
            }
        }
        sc.close();
    }
}

