import java.util.Scanner;
public class AreaOfIsoscelesTraingle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a,b;
	System.out.println("Enter sides of Isosceles Traingle");
	a=sc.nextInt();
	System.out.println("Enter breadth of Isosceles Traingle");
	b=sc.nextInt();
	
	double area=(Math.sqrt(a*a-b*b/4)*b)/2;
	System.out.println("Area  Of Isosceles Traingle="+area);
}
}



