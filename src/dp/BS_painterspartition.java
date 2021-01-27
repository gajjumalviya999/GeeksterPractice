package dp;
class BS_painterspartition{
	public static void main(String[] args) {
		int k = 2;
		
		int[] arr = { 10,10,10,10 };

		paintersPartition(arr, k);
		
	}

	private static void paintersPartition(int[] arr, int k) {
		// TODO Auto-generated method stub
	 int max=Integer.MIN_VALUE;
	 int sum=0;
	 for(int i:arr) {
		 sum+=i;
		 max=Math.max(max,i);
	 }
	 System.out.println("  gfgfgc"); 
	 int low=max; //n painters
	 int high=sum;//1 painter
	 
	 while(low<high) {
		int  mid=(low+high)/2;
		int painterreqformid=painters(arr,mid);
		if(painterreqformid<=k)
			{
			high=mid;
			}
		else {
			low=mid+1;}
		
	 }
	 
	 System.out.println(low);
	}

	private static int painters(int arr[],int mid) {
		// TODO Auto-generated method stub
		int paintersno=1;
		int sum=0;
		for(int i:arr) {
			sum+=i;
			if(sum>mid) {
				sum=i;
				paintersno+=1;
			}
			
		}
		return paintersno;
	}
}