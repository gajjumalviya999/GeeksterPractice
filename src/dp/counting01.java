package dp;

public class counting01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		no2continue0(3);
		no2Building(3);
		
	}
	private static void no2Building(int plotinrow) {
		// TODO Auto-generated method stub
		int dp[][]= new int[plotinrow][2];
		//1 building
		//0 space
		dp[0][0]=1;
		dp[0][1]=1;
		for(int i=1;i<plotinrow;i++) {
			dp[i][0]=dp[i-1][0]+dp[i-1][1];
			dp[i][1]=dp[i-1][0];
		}
				
		System.out.println((int)Math.pow(dp[plotinrow-1][0]+dp[plotinrow-1][1],2));
	}
	private static void no2continue0(int n) {
		// TODO Auto-generated method stub
		int dp[][]=new int[n][2];
		dp[0][0]=1;
		dp[0][1]=1;
		for(int i=1;i<n;i++) {
			dp[i][0]=dp[i-1][1];
			dp[i][1]=dp[i-1][0]+dp[i-1][1];
		}
		System.out.println(dp[n-1][0]+dp[n-1][1]);
	}
	

}
