import java.util.Scanner;
public class VolumeOfCylinder {
	public static void main(String args[])
	{
		double r,h,volume;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of cylinder");
		r=sc.nextInt();
		System.out.println("Enter height of cylinder");
		h=sc.nextInt();
		volume=3.14*r*r*h;
		System.out.println("Area of Rhombus"+volume);
		
	}
}

