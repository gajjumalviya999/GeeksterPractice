package dp;

public class MinimumCostPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=  { {2,8,4,1,6,4,2},
                {6,0,9,5,3,8,5},
                {1,4,3,4,0,6,5},
                {6,4,7,2,4,6,1},
                {1,0,3,7,1,2,7},
                {1,5,3,2,3,0,9},
                {2,2,5,1,9,8,2}};
		System.out.println(minimumcostpath(arr));
	}

	private static int minimumcostpath(int[][] arr) {
		// TODO Auto-generated method stub
		int n=arr.length;
		int m=arr[0].length;
		int dp[][]= new int [n][m];
		dp[n-1][m-1]=arr[n-1][m-1];
		for(int j=m-2;j>=0;j--) {
			dp[n-1][j]=dp[n-1][j+1]+arr[n-1][j];
		}
		for(int i=n-2;i>=0;i--) {
			dp[i][m-1]=arr[i][m-1]+dp[i+1][m-1];
		}
		for(int i=n-2;i>=0;i--) {
			for(int j=m-2;j>=0;j--) {
				dp[i][j]=arr[i][j]+Math.min(dp[i+1][j],dp [i][j+1]);
			}
		}
		
		return dp[0][0];
	}

}
