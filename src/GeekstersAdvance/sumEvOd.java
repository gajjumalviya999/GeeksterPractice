package GeekstersAdvance;
import java.util.Scanner;
public class sumEvOd

{

	public static void main(String[] args) {
	Scanner Sc=new Scanner(System.in);
	
	System.out.println("enter how many number you want to enter(Size)  ");
	
	
	int n=Sc.nextInt();
	int arr[]=new int[n];
	int sumeven=0;
	int sumodd=0;
	System.out.println("enter Array :");
	for(int i=0; i<n;i++) {
		arr[i]=Sc.nextInt();
		if(arr[i]%2==0) 
			sumeven+=arr[i];
		else
			sumodd+=arr[i];
	}
	System.out.println("Sum even : "+ sumeven + " Sum Odd : "+ sumodd);	
	Sc.close();
	}

}
