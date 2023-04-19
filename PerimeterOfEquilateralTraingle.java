import java.util.Scanner;
public class PerimeterOfEquilateralTraingle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter side of Equilateral Traingle");
	a=sc.nextInt();
	
	
	int perimeter=3*a;
	System.out.println("Perimeter Of Equilateral Traingle is="+perimeter);
}
}
