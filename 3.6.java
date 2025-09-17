import java.util.Scanner;
public class duplicate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ekam Khatri, 24csu335\n");
        int[] arr = new int[5];
        System.out.print("Enter 5 elements: ");
        for (int i = 0; i < 5; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int newLength = 5;
        for (int i = 0; i < newLength; i++) 
        {
            for (int j = i + 1; j < newLength; j++) 
            {
                if (arr[i] == arr[j]) {
                    for (int k = j; k < newLength - 1; k++) 
                    {
                        arr[k] = arr[k + 1];
                    }
                    newLength--;
                    j--; 
                }
            }
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
