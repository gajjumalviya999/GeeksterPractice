package GeekstersAdvance;
import java.util.Scanner;
public class LargeAndSmall

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	int flag=1;
	System.out.println("enter a number");
	int large=Sc.nextInt();
	int small=large;
while(flag==1)
	{System.out.println("Do you want to enter more(1/0)");
	 flag=Sc.nextInt();
	 if(flag==1)
	 {
		 System.out.println("enter a number");
		int a=Sc.nextInt();
		if(a>large)
			large=a;
		if(a<small)
			small=a;
	 }
	
    }
System.out.println("largest among enters: "+ large + " and smallest is : "+ small);
Sc.close();
	}
}
