import java.util.Scanner;
public class rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        System.out.println("Ekam Khatri, 24csu335");
        do {
            System.out.print("\nChoose shape:\n1.Rhombus\n2.LeftTriangle\n3.Right Triangle\n4.Pyramid\nEnter choice: ");
            int shape = sc.nextInt();                    
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter the character to build the shape: ");
            char ch = sc.next().charAt(0);
            switch (shape) {
                case 1: 
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");}
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print(ch);}
                        System.out.println();}
                    for (int i = rows - 1; i >= 1; i--) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");}
                        for (int k = 1; k <= (2 * i - 1); k++) {System.out.print(ch);}
                        System.out.println();}
                    break;
                case 2: 
                    for (int i = 1; i <= rows; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(ch);}
                        System.out.println();}
                    break;
                case 3: 
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");}
                        for (int j = 1; j <= i; j++) {
                            System.out.print(ch);}
                        System.out.println();}
                    break;
                case 4: 
                    for (int i = 1; i <= rows; i++) {
                        for (int j = rows; j > i; j--) {
                            System.out.print(" ");}
                        for (int k = 1; k <= (2 * i - 1); k++) {
                            System.out.print(ch);}
                        System.out.println();}
                    break;
                default: System.out.println("Invalid choice!");}
            System.out.print("\nDo you want to try again? (Y/N): ");
            choice = sc.next().charAt(0);
        } while (choice != 'N' && choice != 'n');
        sc.close();}}




