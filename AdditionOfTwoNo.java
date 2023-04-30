import java.util.Scanner;

public class AdditionOfTwoNo {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n1,n2,add;
	System.out.println("Enter 1 st Number");
	n1=sc.nextInt();
	System.out.println("Enter 2 nd Number");
	n2=sc.nextInt();
	add=n1+n2;
	System.out.println("Addition is "+add);
}
}
