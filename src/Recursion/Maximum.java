package Recursion;
class Maximum{
	public static void main(String[] args) {
		int arr[]= {1,2,3,6,5};
	System.out.println(maximum(arr,0));
	}

	private static int maximum(int[] arr,int idx) {
		// TODO Auto-generated method stub
		if(idx==arr.length-1)
			return arr[idx];
		int maxafterme=maximum(arr,idx+1);
		if(arr[idx]>maxafterme)
			return arr[idx];
		else 
			return maxafterme;
		
	}
}