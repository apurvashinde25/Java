import java.util.Scanner;

public class VolumeOfSphere {
	public static void main(String args[])
	{
		double r,volume;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of Sphere");
		r=sc.nextInt();
		volume=((3.14*r*r*r)*4/3);
		System.out.println("Volume of Sphere"+volume);
		
	}
	

}
