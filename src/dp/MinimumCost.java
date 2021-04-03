package dp;

public class MinimumCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[][]= {{1,2,3},{1,0,2},{1,5,3}};
		System.out.println(minimumcostTopDown(cost));
		minimumcostWithPath(cost);
	}
	private static int minimumcostTopDown(int[][]cost) {
		// TODO Auto-generated method stub
		int dp[][]=new int[cost.length][cost[0].length];
		dp[0][0]=cost[0][0];
		for(int i=1;i<cost[0].length;i++) {
			dp[0][i]=dp[0][i-1]+cost[0][i];
		}
		for(int i=1;i<cost.length;i++) {
			dp[i][0]=dp[i-1][0]+cost[i][0];
		}
		for(int i=1;i<cost.length;i++) {
			for(int j=1;j<cost[0].length;j++) {
				dp[i][j]=Math.min(dp[i-1][j]+cost[i][j], dp[i][j-1]+cost[i][j]);
			}
		}
		return dp[cost.length-1][cost[0].length-1];
	}
	
	 static class Pair{
		int costij;
		String path;
	}
	 private static void minimumcostWithPath(int [][] cost) {
		 Pair dp[][]= new Pair[cost.length][cost[0].length];
		 for(int i=0;i<dp.length;i++) {
			 for(int j=0;j<dp.length;j++) {
				Pair P= new Pair();
				if(i==0&&j==0) {
					P.costij=cost[i][j];
					P.path="-";
					dp[i][j]=P;
				}
				else if(i==0) {
					P.costij=dp[i][j-1].costij+cost[i][j];
					P.path=dp[i][j-1].path+"H";
					dp[i][j]=P;
				}
				else if(j==0) {
					P.costij=dp[i-1][j].costij+cost[i][j];
					P.path=dp[i-1][j].path+"V";
					dp[i][j]=P;
				}
				else {
					if(dp[i-1][j].costij<dp[i][j-1].costij) {
						P.costij=dp[i-1][j].costij+cost[i][j];
						P.path=dp[i-1][j].path+"V";
						dp[i][j]=P;
					}
					else {
						P.costij=dp[i][j-1].costij+cost[i][j];
						P.path=dp[i][j-1].path+"H";
						dp[i][j]=P;
						
					}
				}
			 }
		 }
		System.out.println(dp[cost.length-1][cost[0].length-1].costij+"  with path starting from 0, 0 and follow this : "+dp[cost.length-1][cost[0].length-1].path);
	 }
}
