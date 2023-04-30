import java.util.Scanner;
public class SumOfDigitOfNo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n,d,sum=0;
		System.out.println("Enter a Number");
		n=sc.nextInt();
		while(n>0)
		{
			d=n%10;
			sum=sum+d;
			n=n/10;
		}
		System.out.println("sum is "+ sum);
	}

}
