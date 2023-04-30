import java.util.Scanner;
import java.lang.Math;
public class distancebtwtwopoints {
	public static void main(String args[])
	{
		double x1,x2,y1,y2,dis;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter X1 point ");
		x1=sc.nextInt();
		System.out.println("Enter X2 point ");
		x2=sc.nextInt();
		System.out.println("Enter Y1 point ");
		y1=sc.nextInt();
		System.out.println("Enter Y2 point ");
		y2=sc.nextInt();

		dis=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("distance between two points "+dis);

}
}