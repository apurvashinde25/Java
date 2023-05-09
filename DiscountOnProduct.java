import java.util.Scanner;
public class DiscountOnProduct {
public static void main(String args[])
{
	float saleCost, costToPaid, discount,discount_cost,cost;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the  Amount : ");
    saleCost = sc.nextFloat();
    System.out.print("Enter the Discount on Product : ");
    discount = sc.nextFloat();
    
    discount_cost=discount/100;
    cost=discount_cost*saleCost;
    costToPaid=saleCost-cost;
    System.out.print("Amount is "+costToPaid);
       
}
}
