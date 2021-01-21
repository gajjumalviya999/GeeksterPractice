package IntroPart;
import java.util.Scanner;
public class allPrimeUptoN

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter a Number ");
	
		int n=Sc.nextInt();
		for(int a=2;a<=n;a++)
		{
			int flag=1;
			for(int i=2;i<=Math.sqrt(a);i++)
			{
				if(a%i==0)
				flag=0;
		        else
			    continue;
			}
			if(flag==1) 
			System.out.println(a);
			else
				continue;
		}
		Sc.close();
	}
}


