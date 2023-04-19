import java.util.Scanner;
public class AreaOfEquilateralTraingle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a;
	System.out.println("Enter side of Equilateral Traingle");
	a=sc.nextInt();
	
	double area=Math.sqrt(3)/4*(a*a);
	System.out.println("Area of Equilateral Traingle is="+area);
}

}
