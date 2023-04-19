import java.util.Scanner;
public class FibonacciSeries {
	public static void main(String args[])
	{
				
		int a=0,b=1,z=0,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no");
		n=sc.nextInt();
		while(z<=n)
		{
			System.out.println(z);
			a=b;
			b=z;
			z=a+b;
			
		}

		
	}
}
