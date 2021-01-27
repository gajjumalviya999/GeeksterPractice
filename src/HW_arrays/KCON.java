package HW_arrays;
class KCON{
	public static void main(String[] args) {
		int a[]= {1,-2,1};
		int k=2;
		System.out.println(kcon(a,k));
	}

	private static int kcon(int[] a, int k) {
		// TODO Auto-generated method stub
		int maxsum=Integer.MIN_VALUE;
		int B[]=new int[a.length*k];
		int N=a.length;
		for(int i=0;i<N*k;i++) {
			B[i]=a[i%N];
		}
		int currsum=0;
		for(int i=0;i<N*k;i++) {
			currsum+=B[i];
			if(currsum>maxsum)
				maxsum=currsum;
			if(currsum<0)
				currsum=0;
		
		}
		return maxsum;
	}
}