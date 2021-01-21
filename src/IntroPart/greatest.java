package IntroPart;
import java.util.Scanner;
public class greatest

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter two Number ");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		if(a<b)
		System.out.println(b + "is greater");
		else
		System.out.println(a +"is greater");
				

		Sc.close();
		}

}
