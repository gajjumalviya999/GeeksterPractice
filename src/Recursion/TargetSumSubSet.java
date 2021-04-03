package Recursion;

import java.util.ArrayList;

public class TargetSumSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,7,1,3};
		targetsumsubset(arr,10);
	}
	static class Pair{
		boolean value;
		String str;
	}
	private static void targetsumsubset(int[] arr,int sum) {
		// TODO Auto-generated method stub
		
		Pair dp[][]=new Pair[arr.length+1][sum+1];
		int n=dp.length;
		int m=dp[0].length;
		for(int i=0;i<n;i++) {//elements
			for(int j=0;j<m;j++) {//sum
				Pair P= new Pair();
				if(j==0) {
					P.value=true;
					P.str="";
				}
				else if(i==0) {
					P.value=false;
					P.str="";
				}
				else if(dp[i-1][j].value==true) {
					P.value=true;
					P.str=dp[i-1][j].str;
				}
				else if((j-arr[i-1])>=0 && dp[i-1][j-arr[i-1]].value==true) {
					P.value=true;
					P.str=dp[i-1][j-arr[i-1]].str+arr[i-1];
				}
				else 
				{
					P.value=false;
					P.str="";
				}
				dp[i][j]=P;
			}
		}
		System.out.println(dp[n-1][m-1].value+ " "+ dp[n-1][m-1].str);
		
	}
}
