package dp;

public class LIS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {50, 3, 10, 7, 40, 80};
		System.out.println(	lis(arr));
	}

	private static int  lis(int[] arr) {
		// TODO Auto-generated method stub
		int dp[]=new int [arr.length];
		dp[0]=1;
		for(int i=1;i<dp.length;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				if(arr[j]<arr[i]) {
					max=Math.max(max, dp[j]);
				}
			}
			dp[i]=max+1;
		}
		return dp[arr.length-1];
	}

}
