
import java.util.Scanner;
public class AverageOfNnumbers {
	public static void main(String args[])
	{
		double n, i, sum=0, avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find average upto that number");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		avg=(sum/n);
		System.out.println("avg is "+avg);
		
	}
	
}
