package dp;

public class PartitionSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
				// TODO Auto-generated method stub
				int n=5;
				int k=2;
				partitionsubset(n,k);
			}

			private static void partitionsubset(int n,int k) {
				// TODO Auto-generated method stub
				
				int dp[][]=new int[k+1][n+1];
				
				for(int i=0;i<=k;i++) { // team
					for(int j=0;j<=n;j++) {// person
						
						if(i==0||j==0||i>j)
						{ //0 teams ,0 people // people less then team
							dp[i][j]=0;
						}
						else if(i==j) {
							dp[i][j]=1;
						}
						else {
							dp[i][j]=dp[i-1][j-1]+ dp[i][j-1]*k;
						}
						
					}
				}
				for(int [] a:dp) {
					for(int b:a) {
						System.out.print(b+"\t");
					}
					System.out.println();
				}
				
				
			}

//			
//	13-2
			// 23-1

	

}
