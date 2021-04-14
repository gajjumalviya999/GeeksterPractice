package dp;

public class FriendsPairing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(friendspairing(3));
		
	}

	private static int friendspairing(int n) {
		// TODO Auto-generated method stub
		if(n<=2) {
			return n;
		}
		int dp[]= new int[n+1];
		dp[0]=0;
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++) {
			dp[i]= dp[i-1]+(i-1)*dp[i-2];
		}
		return dp[n];
	}

}
