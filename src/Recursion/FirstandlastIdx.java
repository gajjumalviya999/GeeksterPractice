package Recursion;
class FirstandlastIdx{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,4,3,4,5,6,3};
		System.out.println(firstidx(arr,0,3));
		System.out.println(lastidx(arr,0,3));
	}

	private static int lastidx(int[] arr, int vidx, int val) {
		// TODO Auto-generated method stub
		 if(vidx==arr.length)
			 return -1;
		int foundidx=lastidx(arr,vidx+1,val);
		if(foundidx==-1) {
			if(arr[vidx]==val)
				return vidx;
			else return -1;
		}
		else
			return foundidx;
	}

	private static int firstidx(int[] arr, int vidx, int val) {
		// TODO Auto-generated method stub
		if(vidx==arr.length)
			return -1;
		if(arr[vidx]==val)
			 return vidx;
		 else
			 return firstidx(arr,vidx+1,val);
	
	}
}