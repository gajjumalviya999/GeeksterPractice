package Recursion;
class PrintArray{
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		printarray(arr,0);
		printrev(arr,0);
	}

	private static void printrev(int[] arr, int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length)
			return ;
		printrev(arr,idx+1);
		System.out.println(arr[idx]);
		
	}

	private static void printarray(int[] arr,int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length)
			return ;
		System.out.println( arr[idx]);
		printarray(arr,idx+1);
	}
}