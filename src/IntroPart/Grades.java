package IntroPart;

import java.util.Scanner;

public class Grades
{

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		int flag=1;
		while(flag==1)
		{
		System.out.println("enter Marks ");
		int c=Sc.nextInt();
		
		
		
		if(c<25)
			System.out.println("Grade is F");
		else if(c<45)
			System.out.println("Grade is E");
		else if(c<50)
			System.out.println("Grade is D");
		else if(c<60)
			System.out.println("Grade is C");
		else if(c<=80)
			System.out.println("Grade is B");
		else
			System.out.println("Grade is A");
		System.out.println(	"do you want to enter again(1/0)");
		flag=Sc.nextInt();
		}
		Sc.close();	
	}

}
