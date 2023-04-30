import java.util.Scanner;
public class FactorialProgram {
	public static void main(String args[])
	{
		int i,n,factorial_no=1;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			factorial_no=factorial_no*i;
		}
		System.out.println("Factorial of no is="+factorial_no);
		
	}
}
