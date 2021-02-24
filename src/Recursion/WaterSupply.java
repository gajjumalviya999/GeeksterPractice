package Recursion;

import java.util.Arrays;
import java.util.Scanner;

class WaterSupply{
	public static void main(String[] args) {
		
		System.out.println("Enter Number of Test Cases");
		Scanner Sc=new Scanner(System.in);
		int [] arr= {1,5,7,10};
		Arrays.sort(arr);
		int n=arr.length;
		int test=Sc.nextInt();
		while(test>0) {
			System.out.println("enter demand of water");
			int water=Sc.nextInt();
			
			int count=0;
			while(water>=0) 
			{
				loop:for(int i=n-1;i>=0;i--)
				{
					if(water>arr[i])
					{
						water=water-arr[i];
						System.out.println(water);
						count++;
						break loop;
				    }
					
				}
			}
			System.out.println("for  amount of water we need  "+count+ "Buckets ");
			test-=1;
		}
		
	}
	
}