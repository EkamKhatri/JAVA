import java.util.Scanner;
public class index {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekam Khatri, 24csu335\n");

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nEnter element to search: ");
        int search = sc.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) 
        {
            if (arr[i] == search) 
            {
                index = i;
                break;
            }
        }
        if (index != -1) 
        {
            System.out.println("Element " + search + " found at index " + index + ".");
        } 
        else 
        {
            System.out.println("Element " + search + " not found. Returning -1.");
        }
        sc.close();
    }
}






