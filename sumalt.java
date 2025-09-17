import java.util.Scanner;
public class sumalt {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekam Khatri, 24csu335\n");
        int[] arr = new int[5];
        System.out.print("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < 5; i++) 
        {
            sum += arr[i];
        }
        System.out.println("Sum of all elements: " + sum);
        int altSum = 0;
        for (int i = 0; i < 5; i += 2) 
        {
            altSum += arr[i];
        }
        System.out.println("Sum of alternate elements: " + altSum);
        sc.close();
    }
}

