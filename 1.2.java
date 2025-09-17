import java.util.Scanner;
public class minutes
{
	public static void main(String args[])
	{
		System.out.print("Ekam Khatri, 24csu335\n");
		Scanner scan= new Scanner (System.in);
		int x,m,y,a,b,d;
		System.out.print("Minutes in a day = 1440\nMinutes in a month = 43800\nMinutes in an year = 525600\nEnter number of minutes: ");
		x=scan.nextInt();
		y=x/525600;
		a=x%525600;
		m=a/43800;
		b=a%43800;
		d=b/1440;
		System.out.print(x+" minutes is equal to "+y+" years, "+m+" months and "+d+" days=> "+y+"-"+m+"-"+d);
	}
}



		
