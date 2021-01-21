package IntroPart;
import java.util.Scanner;
public class Armstrong

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number ");
		int a=Sc.nextInt();
		int num=a;
		int ans=0;
		int rem=0;
		while(a!=0) {
			rem=a%10;
			ans+=rem*rem*rem;
			a/=10;
			
		}
		if(ans==num) {
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
System.out.println();
Sc.close();
	}

}
