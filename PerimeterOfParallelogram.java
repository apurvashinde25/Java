import java.util.Scanner;
public class PerimeterOfParallelogram {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int b,h;
	System.out.println("Enter breadth of Parallelogram");
	b=sc.nextInt();
	System.out.println("Enter height of Parallelogram");
	h=sc.nextInt();
	
	int perimeter=2*(b+h);
	System.out.println("Perimeter Of Parallelogram is="+perimeter);
}
	

}
