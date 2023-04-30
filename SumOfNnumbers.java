import java.util.Scanner;
public class SumOfNnumbers {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i,n,sum=0;
		System.out.println("Enter a number upto which you want addition of numbers");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("sum is "+sum);
	}
}
