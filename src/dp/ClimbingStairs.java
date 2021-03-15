package dp;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int arr[]= {3,2,4,2,0,2,3,1,2,2};
		System.out.println(climbingstairsmovemin(n,arr));
	}

	private static Integer climbingstairsmovemin(int n, int []arr) {
		// TODO Auto-generated method stub
		Integer dp[]=new Integer[n+1];
		dp[n]=0;
		for(int i=n-1;i>=0;i--) {
			if(arr[i]!=0) {	
			int min=Integer.MAX_VALUE;
			for(int j=1;j<=arr[i];j++) {
				if(i+j<=n&&dp[i+j]!=null)
				min= Math.min(min, dp[i+j]);
			}
			if(min!=Integer.MAX_VALUE)
			 dp[i]=min+1;
			}
		}
		
		return dp[0];
	}

}
