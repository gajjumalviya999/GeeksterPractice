package GeekstersAdvance;

import java.util.Scanner;

public class SumOdd
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("enter a number upto which you want to sum of odd number:  ");
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		System.out.println(" Here You Go!!");
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
				sum+=i;
		}
    System.out.println(sum);
    Sc.close();
	}

}
