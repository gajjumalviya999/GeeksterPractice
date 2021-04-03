package dp;

public class Knapsack01 {
	public static void main(String[] args) {
		int weight[]= {2,5,1,3,4};
		int profit[]= {15,14,10,45,30};
		int begsize=7;
		knapsack01(weight,profit,begsize);
	}

	private static void knapsack01(int[] weight, int[] profit, int begsize) {
		// TODO Auto-generated method stub
		
		int dp[][]= new int[weight.length+1][begsize+1];
		
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				dp[i][j]=dp[i-1][j];
				if(j>=weight[i-1]) {
				dp[i][j]=Math.max(dp[i-1][j], profit[i-1]+dp[i-1][j-weight[i-1]]);
				}
				System.out.print(dp[i][j]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
