package HW_searchandsort;
class searchElementadjusantdifferK{
	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
	   System.out.println(search(arr,60));
		
	}

	private static int search(int[] arr, int x) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<arr.length) {
			if(arr[i]==x)
				return i;
			i++;
		}
		return -1;
	}
}