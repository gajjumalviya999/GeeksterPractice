package HW;
class allSubarrayWith0sum{
	public static void main(String[] args) {
		int arr[]={ 6, 3, -1, -3, 4, -2, 2,
		             4, 6, -12, -7};
		Allsubarraywith0sum(arr);
	}

	private static void Allsubarraywith0sum(int[] arr) {
		// TODO Auto-generated method stub
		boolean flag=false;
	int currsum=0;
	for(int i=0;i<arr.length-1;i++) {
		currsum=0;
		for(int j=i;j<arr.length;j++) {
			currsum+=arr[j];
			if(currsum==0) {
				System.out.println("subarray found with 0 sum between "+i+ "  "+j);
				flag=true;
		}
	}
	}
	if(!flag)
		System.out.println(" No subarray found with 0 Sum");
 }
}