import java.util.Scanner;
public class CommissionPercentage {
public static void main(String args[])
{
	  Scanner sc=new Scanner(System.in);
 
	  System.out.print("Enter amount:");
 
	  double amount=sc.nextDouble();
 
	  System.out.print("Enter commission Percentage:");
 
      double commission_Percentage=sc.nextDouble();
 
	  double commission=(commission_Percentage/100)*amount;  	   
 
      	  System.out.println("Commission amount="+commission);
 
	}

}

