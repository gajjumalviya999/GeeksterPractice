package IntroPart;
import java.util.Scanner;
public class RectoSquare
{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter length and breath ");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		if(a==b)
		System.out.println("Square");
		else
		System.out.println("Rectangle");
				
		Sc.close();
	}

}
