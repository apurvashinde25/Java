import java.util.Scanner;
public class AreaOfRhombus {
	public static void main(String args[])
	{
		int d1,d2,area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter diagonal 1 of Rhombus");
		d1=sc.nextInt();
		System.out.println("Enter diagonal 2 of Rhombus");
		d2=sc.nextInt();
		area=((d1*d2)/2);
		System.out.println("Area of Rhombus"+area);
		
	}
}
