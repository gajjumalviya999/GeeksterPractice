package dp;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int [] storage=new int[n+1];
		int arr[]= {3,2,0,2,3,1,0,1,2,0,1};
		System.out.println(climbingstairsmovemin(arr));
		System.out.println(climbingDownDP(n,storage));
	}

	private static int climbingstairsmovemin( int []arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		Integer dp[]=new Integer[n];
		dp[0]=0;
		for(int i=1;i<n;i++) {
			for(int j=0;j<i;j++) {
				int min=Integer.MAX_VALUE;
				if(arr[j]>=i-j) {
					min=Math.min(min, dp[j]);
				}
				dp[i]=min;
			}
		}
		return dp[n-1];
	}
	private static int  climbingRec(int n) {
		if(n==1||n==0)
			return 1;
		if(n<0)
			return 0;
		return climbingRec(n-1)+climbingRec(n-2)+climbingRec(n-3);
	}
	private static int climbingDownDP(int n, int [] storage) {
		if(n==1||n==0)
			return 1;
		if(n<0)
			return 0;
		if(storage[n]!=0) {
			return storage[n];
		}
		return climbingRec(n-1)+climbingRec(n-2)+climbingRec(n-3);
	}
	private static int climbingDownDP2(int n) {
		int [] dp=new int[n+1];
		dp[0]=1;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
		return dp[n];
	}
	
	

}
