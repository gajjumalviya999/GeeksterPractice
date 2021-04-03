package dp;

public class GoldMines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int gold[][]= {{10, 33, 13, 15},
                       {22, 21, 04, 1},
                       {5, 0, 2, 3},
                       {0, 6, 14, 2}};
		goldminingwithPath(gold);
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
	static class Pair{
		int amount;
		String Path;
	}
	private static void goldminingwithPath(int[][] gold) {
		int n=gold.length;
		int m=gold[0].length;
		Pair dp[][]= new Pair[n][m];
		for(int i=0;i<dp.length;i++) {
			Pair P= new Pair();
			P.amount=gold[i][m-1];
			P.Path="-";
			dp[i][m-1]=P;
		}
		for(int j=m-2;j>=0;j--) {
			for(int i=0;i<n;i++) {
				if(i==0) {
					Pair P=new Pair();
					P.amount=gold[i][j]+Math.max(dp[i][j+1].amount,dp[i+1][j+1].amount);
					if(dp[i][j+1].amount>dp[i+1][j+1].amount)
						P.Path="S"+dp[i][j+1].Path;
					else
						P.Path="D"+dp[i+1][j+1].Path;
					dp[i][j]=P;
				}
				else if(i==n-1) {
					Pair P=new Pair();
					P.amount=gold[i][j]+Math.max(dp[i][j+1].amount,dp[i-1][j+1].amount);
					if(dp[i][j+1].amount>dp[i-1][j+1].amount)
						P.Path="S"+dp[i][j+1].Path;
					else
						P.Path="U"+dp[i-1][j+1].Path;
					dp[i][j]=P;
				}
				else  {
					Pair P=new Pair();
					P.amount=gold[i][j] + Math.max(dp[i][j+1].amount,Math.max(dp[i+1][j+1].amount,dp[i-1][j+1].amount));
					if(dp[i][j+1].amount>dp[i-1][j+1].amount&&dp[i][j+1].amount>dp[i+1][j+1].amount)
						P.Path="S"+dp[i][j+1].Path;
					else if(dp[i+1][j+1].amount>dp[i][j+1].amount&&dp[i+1][j+1].amount>dp[i-1][j+1].amount)
						P.Path="D"+dp[i+1][j+1].Path;
					else 
						P.Path="U"+dp[i-1][j+1].Path;
					dp[i][j]=P;
				}
			}
		}
		int max=dp[0][0].amount;
		Pair ans=dp[0][0];
		int start=0;
		for(int i=1;i<n;i++) {
			if(max<dp[i][0].amount) {
				max=dp[i][0].amount;
				ans=dp[i][0];
				start=i;
			}
		}
		System.out.println(ans.amount +" "+ ans.Path+" starting from  " + start);
		
		
	}
	

}
