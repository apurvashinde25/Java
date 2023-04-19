import java.util.Scanner;
public class VolumeOfPrism {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int b,h;
	System.out.println("Enter Base Of Prism");
	b=sc.nextInt();
	System.out.println("Enter height Of Prism");
	h=sc.nextInt();

	int volume=b*h;
	System.out.println("Volume of Prism is="+volume);
}
}
