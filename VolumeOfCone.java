import java.util.Scanner;
public class VolumeOfCone {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int h,r;
	System.out.println("Enter Radius Of Cone");
	r=sc.nextInt();
	System.out.println("Enter height Of Cone");
	h=sc.nextInt();

	double volume=3.14*r*r*(h)/3;
	System.out.println("Volume of cone is="+volume);
}
}
