package Recursion;
class FindInArr{
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,5};
	System.out.println(findinarr(arr,9,0));
	}

	private static boolean findinarr(int[] arr,int value,int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length)
			return false;
		if(arr[idx]==value)
			return true;
		boolean afterme=findinarr(arr,value,idx+1);
		 return afterme;
		
		
	}
}