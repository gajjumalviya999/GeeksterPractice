package dp;

import java.util.Arrays;

public class CoinChangeCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,6};
		int target=10;
	System.out.println(	coinchangecom(arr,target));
	coinchangeComself(arr,target);
	System.out.println("perm");
	System.out.println(coinchangeperm(arr,target));
	coinchangePermself(arr,target);
	
	}

	private static int coinchangeperm(int[] arr, int target) {
		// TODO Auto-generated method stub
		int dp[]=new int[target+1];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i>=arr[j]) {
					dp[i]+=dp[i-arr[j]];
				}
			}
		}		
		return dp[target];
	}

	private static int coinchangecom(int[] arr, int target) {
		// TODO Auto-generated method stub
		int dp[]= new int[target+1];
		dp[0]=1;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[i];j<=target;j++) {
				dp[j]+=dp[j-arr[i]];
				}
			}
		return dp[target];
		
	}
	
	
	public static void coinchangeComself(int arr[], int sum) {
		int dp[]=new int[sum+1];
		 dp[0]=1;
		 for(int i=0;i<arr.length;i++) {//2 3 5
			 for(int j=1;j<=sum;j++) {
				 if(arr[i]<=j) {
					 dp[j]=dp[j]+dp[j-arr[i]];
				 }
			 }
		 }
		 System.out.println(dp[sum]);
	}
	public static void coinchangePermself(int arr[], int sum) {
		int dp[]= new int[sum+1];
		dp[0]=1;
		for(int i=0;i< dp.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]<=i) {
					dp[i]=dp[i]+dp[i-arr[j]];
				}
			}
		}
		System.out.println(dp[sum]);
	}
	
}
