import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Ekam Khatri, 24csu335\n");

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int[] evenArr = new int[evenCount];
        int[] oddArr = new int[oddCount];
        int e = 0, o = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0)
                evenArr[e++] = arr[i];
            else
                oddArr[o++] = arr[i];
        }
        System.out.print("\nOriginal array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nLength of original array: " + n);
        System.out.print("\nEven array: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println("\nLength of even array: " + evenCount);
        System.out.print("\nOdd array: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddArr[i] + " ");
        }
        System.out.println("\nLength of odd array: " + oddCount);
        sc.close();
    }
}
