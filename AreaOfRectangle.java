import java.util.Scanner;
public class AreaOfRectangle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int b,l;
	System.out.println("Enter breadth of Rectangle");
	b=sc.nextInt();
	System.out.println("Enter length of Rectangle");
	l=sc.nextInt();
	
	int area=b*l;
	System.out.println("Area is Of Rectangle="+area);
}
}


