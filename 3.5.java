import java.util.Scanner;
public class reverse{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekam Khatri, 24csu335\n");
        int[] arr = new int[5];
        System.out.print("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length / 2; i++) 
        {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < 5; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}


