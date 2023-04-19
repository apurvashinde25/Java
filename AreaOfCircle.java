import java.util.Scanner;
public class AreaOfCircle {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int r;
		System.out.println("Enter radius of cricle");
		r=sc.nextInt();
		double area=3.14*r*r;
		System.out.println("Area is="+area);
		
		
	}

}
