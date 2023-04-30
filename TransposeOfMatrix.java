import java.util.*;
import java.util.Scanner;
public class TransposeOfMatrix {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a[][]=new int[3][3];
	int b[][]=new int[3][3];
	int i,j;
	System.out.println("Enter Elements For matrix");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			a[i][j]=sc.nextInt();
			
		}
	}
	System.out.println("Matrix is");
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			System.out.print(a[i][j]+"\t");
			
		}
		System.out.println();
		
	}
	System.out.println("Transpose of Matrix is");
	for(i=0;i<b.length;i++)
	{
		for(j=0;j<b[i].length;j++)
		{
			b[i][j]=a[j][i];
			System.out.print(b[i][j]+"\t");
		}
		System.out.println();
	}
}
}
