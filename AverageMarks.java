import java.util.Scanner;
public class AverageMarks {
	public static void main(String args[])
	{
		int s1,s2,s3,sum,avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks of subject 1 ");
		s1=sc.nextInt();
		System.out.println("Enter marks of subject 2 ");
		s2=sc.nextInt();
		System.out.println("Enter marks of subject 3 ");
		s3=sc.nextInt();
		
		sum=s1+s2+s3;
		avg=sum/3;
		System.out.println("Average of marks is"+avg);
	}
}
