package dp;

public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mazepath(0,0,3,3));
	}

	private static int mazepath(int sr, int sc, int er, int ec) {
		// TODO Auto-generated method stub
		int dp[][]=new int [er+1][ec+1];
		dp[sr][sc]=1;
		for(int i=1;i<=ec;i++) {
			dp[sr][i]=dp[sr][i-1];
		}
		for(int i=1;i<=er;i++) {
			dp[i][sc]=dp[i-1][sc];
		}
		for(int i=1;i<=er;i++) {
			for(int j=1;j<=ec;j++) {
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[er][ec];
	}
	
	

}
