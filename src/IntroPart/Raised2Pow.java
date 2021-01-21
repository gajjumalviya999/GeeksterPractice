package IntroPart;
import java.util.Scanner;
public class Raised2Pow

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter two Number ");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int ans=1;
		while(b!=0) {
			ans*=a;
			b--;
		}
	System.out.println("answer is " + ans);		

	Sc.close();
	}

}
