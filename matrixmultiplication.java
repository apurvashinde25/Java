import java.util.*;
import java.util.Scanner;
public class matrixmultiplication {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;
		System.out.println("Enter Elements For 1st matrix");
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
		
		System.out.println("Enter Elements For 2nd matrix");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Matrix is");
		for(i=0;i<b.length;i++)
		{
			for(j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+"\t");
				
			}
			System.out.println();
			
		}
		System.out.println("Multiplication of Matrix is");
		for(i=0;i<c.length;i++)
		{
			for(j=0;j<c[i].length;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
	}




