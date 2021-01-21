package IntroPart;
import java.util.Scanner;
public class palindrome

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number ");
		int a=Sc.nextInt();
		int number=a;
		int rev=0;
		int rem=0;
		while(a!=0) {
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
			
		}
				
     if(rev==number) {
    	 System.out.println("Palindrome");
     }
     else 
    	 System.out.println("not a palindrome number");
     Sc.close();
	}

}
