import java.util.Scanner;
public class PerimeterOfCircle {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int r;
	System.out.println("Enter radios of circle");
	r=sc.nextInt();
	
	
	double perimeter=2*3.14*r;
	System.out.println(" Perimeter Of Circle is="+perimeter);
}

}
