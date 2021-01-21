package IntroPart;

import java.util.Scanner;

public class RevNatural
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number from which you want natural number in reverse order: ");
		Scanner Sc=new Scanner(System.in);
		int n=Sc.nextInt();
		System.out.println("okk here you go!!");
		while(n!=0) {
			System.out.println(n);
			n--;
		}

		Sc.close();}

}
