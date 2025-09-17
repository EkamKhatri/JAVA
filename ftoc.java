import java.util.Scanner;
public class ftoc
{
	public static void main(String args[])
	{	
		System.out.print("Ekam Khatri, 24csu335\n");
		Scanner scan= new Scanner (System.in);
		float f,c;
		System.out.print("Enter temperature in fahrenheit: ");
		f=scan.nextFloat();
		c=(f-32)*5/9;
		System.out.print("Temperature in celsius is "+c);
	}
}