import java.util.Scanner;
public class CurvedSurfaceAreaOfCube {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter side of cube");
	a=sc.nextInt();
	

	int area=6*a*a;
	System.out.println("Curved Surface Area Of Cube="+area);
}
}
