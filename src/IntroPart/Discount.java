package IntroPart;
import java.util.Scanner;
public class Discount

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter Quantity (cost 100per item)");
	
		int a=Sc.nextInt();
		if(a*100>=1000)
		System.out.println("cost is "+ a*90 + "  with 10% discount");
		else
		System.out.println("cost is" +a*100 );
				
		Sc.close();
		}

}
