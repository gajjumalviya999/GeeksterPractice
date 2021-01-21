package GeekstersAdvance;
import java.util.Scanner;
public class FirsttAndLast

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number ");
		int a=Sc.nextInt();
		int last=a%10;
		while(a>10) {
			a=a/10;		
		}
		int first=a;
				
System.out.println("First : " + first +" Last : "+ last);
Sc.close();
	}

}
