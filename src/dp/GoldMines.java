package dp;

public class GoldMines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gold[][]= {{10, 33, 13, 15},
                {22, 21, 04, 1},
                {5, 0, 2, 3},
                {0, 6, 14, 2}};
		System.out.println(goldmining(gold));
	}

	private static int goldmining(int[][] gold) {
		// TODO Auto-generated method stub
		int n=gold.length;
		int m= gold[0].length;
		int dp[][]= new int[n][m];
		for(int i=0;i<n;i++) {
			dp[i][m-1]=gold[i][m-1];
		}
		for(int j=m-2;j>=0;j--) {
			for(int i=0;i<n;i++) {
				if(i==0) {
					dp[i][j]=gold[i][j]+Math.max(dp[i][j+1],dp[i+1][j+1]);
				}
				else if(i==n-1) {
					dp[i][j]=gold[i][j]+Math.max(dp[i][j+1],dp[i-1][j+1]);
				}
				else  {
					dp[i][j]=gold[i][j]+Math.max( dp[i][j+1], Math.max(dp[i+1][j+1],dp[i-1][j+1]));
				}
			}
		}
		int max=dp[0][0];
		for(int i=1;i<n;i++) {
			max=Math.max(max, dp[i][0]);
		}
		return max;
		
	}

}
