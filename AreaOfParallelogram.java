import java.util.Scanner;
public class AreaOfParallelogram {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int d1,d2;
	System.out.println("Enter 1 st diagonal of Parallelogram");
	d1=sc.nextInt();
	System.out.println("Enter 2 nd diagonal of Parallelogram");
	d2=sc.nextInt();
	
	int area=(d1*d2)/2;
	System.out.println("Area  Of Parallelogram="+area);
}

}
