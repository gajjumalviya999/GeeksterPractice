package GeekstersAdvance;

import java.util.Scanner;

public class Calculate
{

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int flag=1;
		while(flag==1)
		{
		System.out.println("enter Two numbers ");
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		System.out.println("enter choice 1. add.. 2. Subtract 3..Multiply 4.. divide");
		int c=Sc.nextInt();
		if(c==1)
			System.out.println(a+b);
		else if(c==2)
			System.out.println(a-b);
		else if(c==3)
			System.out.println(a*b);
		else if(c==4)
			System.out.println(a/b);
		else
			System.out.println("wrong choice");
		
		System.out.println(	"do you want again(1/0)");
		flag=Sc.nextInt();
		}
		
		Sc.close();
		}

}
