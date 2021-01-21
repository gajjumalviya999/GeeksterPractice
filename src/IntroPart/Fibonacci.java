package GeekstersAdvance;
import java.util.Scanner;
public class Fibonacci

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number(greater than 3) ");
		int n=Sc.nextInt();
		int s;
		int prev1=1;
		int prev2=1;
		if(n>2) {
		System.out.println(prev1);
		System.out.println(prev2);
		}
		for(int i=2;i<n;i++) {
			s=prev1+prev2;
			System.out.println(s);
			prev2=prev1;
			prev1=s;
			
		}
		Sc.close();
	}

}
