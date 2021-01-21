package GeekstersAdvance;
import java.util.Scanner;
public class Reverse

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number ");
		int a=Sc.nextInt();
		int rev=0;
		int rem=0;
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
			
		}
				
System.out.println(rev);
Sc.close();
	}

}
