package dp;
class kadanesAlgo{
	public static void main(String[] args) {
		int a[]= {-1,-2,-3,-4,-2,-1};
		System.out.println(kadanesalgo(a));
	}
	public static int kadanesalgo(int arr[]) {
		int maxsum=Integer.MIN_VALUE;
		int currsum=0;
		for(int i=0;i<arr.length;i++) {
			currsum=currsum+arr[i];
			if(currsum>maxsum)
				maxsum=currsum;
			if(currsum<0)
				currsum=0;
		}
		
		
		return maxsum;
	}
	public static int TwoLoops(int arr[]) {
		int maxsum=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum>maxsum)
					maxsum=sum;
				
			}
			
			
		}
		
		return maxsum;
	}
}