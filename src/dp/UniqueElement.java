package dp;
class UniqueElement{
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,2,3,1,4};
		System.out.println(uniqueelment(arr));
		
	}

	private static int uniqueelment(int[] arr) {
		// TODO Auto-generated method stub
		int x=arr[0];
		for(int i=1;i<arr.length;i++) {
			x^=arr[i];
		}
		return x;
	}
}