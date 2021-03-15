package Recursion;

import java.util.ArrayList;

public class TargetSumSubSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,2,7,1,3};
		targetsumsubset(arr,10);
	}

	private static void targetsumsubset(int[] arr,int sum) {
		// TODO Auto-generated method stub
		
		boolean dp[][]=new boolean[arr.length+1][sum+1];
		int n=dp.length;
		int m=dp[0].length;
		for(int i=0;i<n;i++) {
			dp[i][0]=true;
		}
		for(int i=1;i<m;i++) {
			dp[0][i]=false;
		}
		for(int i=1;i<n;i++) {
			for(int j=1;j<m;j++) {
				if(arr[i-1]==j||dp[i-1][j]) {
					dp[i][j]=true;
				}
				else if(j-arr[i-1]>=0&&dp[i-1][j-arr[i-1]]) {
					dp[i][j]=true;
				}
			}
		}
		for(boolean [] a:dp) {
			for(boolean b:a) {
				System.out.print(b+"\t");
			}
			System.out.println();
		}
		
		
	}

}
