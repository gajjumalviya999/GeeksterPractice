package dp;

public class RodCutting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=  {0,3,5,6,15,10,25,12,24 };
		int N=8;
		System.out.println(cutrod(arr,N));
		cutrodPrint(arr,N);
		cutrodself(arr,N);
	}

	private static int cutrod(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		int dp[]= new int[n+1];
		
		dp[0]=0;
		dp[1]=arr[1];
		for(int i=0;i<=n;i++)
		{	int max=0;
		    for(int j=0;j<i;j++) {
		    	max=Math.max(max,arr[j]+dp[i-j]);
		    }
		    dp[i]=max;
		}
		return dp[n];
 }
	static class Pair{
		int value;
		String str;
	}
	private static void  cutrodPrint(int[] arr, int n) {
		// TODO Auto-generated method stub
		
		Pair dp[]= new Pair[n+1];
		Pair P= new Pair();
		P.value=0;
		P.str="-";
		dp[0]=P;
		Pair p1= new Pair();
		p1.value=arr[1];
		p1.str="1";
		dp[1]=p1;
		for(int i=0;i<=n;i++)
		{	int max=0;
			int countj=0;
		    for(int j=1;j<=i;j++) {
		    	
		    	if(arr[j]+dp[i-j].value>max) {
		    		max=arr[j]+dp[i-j].value;
		    		countj=j;
		    	}
		    }
		    Pair Px= new Pair();
		    Px.value=max;
		    Px.str=dp[i-countj].str+countj;
		    dp[i]=Px;
		}
		System.out.println(dp[n].value + " " + dp[n].str);
 }
	
	public static void cutrodself(int arr[],int n) {
		int dp[]= new int [n+1];
		dp[0]=0;
		dp[1]=arr[1];
		for(int i=2;i<=n;i++) {
			int max=0;
			for(int j=0;j<i;j++) {
				max=Math.max(dp[j]+arr[i-j], max);
			}
			dp[i]=max;
		}
		System.out.println(dp[n]);
	}
	
}
