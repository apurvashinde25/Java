import java.util.Scanner;

public class AreaOfTraingle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int b,h;
	System.out.println("Enter base of Traingle");
	b=sc.nextInt();
	System.out.println("Enter height of Traingle");
	h=sc.nextInt();
	
	int area=1/2*b*h;
	System.out.println("Area is="+area);
}
}
