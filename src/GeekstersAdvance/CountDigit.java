package GeekstersAdvance;
import java.util.Scanner;
public class CountDigit

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number ");
		int a=Sc.nextInt();
		int count=0;
		while(a!=0) {
			count++;
			a/=10;
			
		}
				
System.out.println(count);
Sc.close();
	}

}
