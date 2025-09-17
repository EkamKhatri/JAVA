import java.util.Scanner;
class Operations
{
	public static void main(String [] args)
	{
		System.out.print("Ekam Khatri, 24csu335\n");
		Scanner scan= new Scanner (System.in);
		int a,b;
		System.out.print("Enter a: ");
		a=scan.nextInt();
		System.out.print("Enter b: ");
		b=scan.nextInt();
		int sum= a+b;
		System.out.println("Sum is: "+sum);
		int difference= a-b;
		System.out.println("Difference is: "+difference);
		int product= a*b;
		System.out.println("Product is: "+product);
		int quotient= a/b;
		System.out.println("Quotient is: "+quotient);
		int remainder= a%b;
		System.out.println("Remainder is: "+remainder);
	}
}

