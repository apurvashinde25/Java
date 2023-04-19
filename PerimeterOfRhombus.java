import java.util.Scanner;
public class PerimeterOfRhombus {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter Side of Rhombus");
	a=sc.nextInt();
	
	
	int perimeter=4*a;
	System.out.println("Perimeter Of Rhombus is="+perimeter);
}
}
